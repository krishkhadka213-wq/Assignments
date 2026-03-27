package Coursework;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;

/**
 * Write a description of class SubscriptionGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SubscriptionGUI extends JFrame
{
    ArrayList<AIModel> plans = new ArrayList<>();

    private JTextField fieldModelName      = new JTextField(15);
    private JTextField fieldPrice          = new JTextField(10);
    private JTextField fieldContextWindow  = new JTextField(10);
    private JTextField fieldPromptQuota    = new JTextField(10);
    private JTextField fieldTeamSlots      = new JTextField(10);

    private JTextField fieldIndex          = new JTextField(5);
    private JTextField fieldPromptText     = new JTextField(20);
    private JTextField fieldResponseLength = new JTextField(10);

    private JTextField fieldTeamIndex      = new JTextField(5);
    private JTextField fieldMemberName     = new JTextField(15);

    private JTextArea outputArea = new JTextArea(12, 50);

    public SubscriptionGUI() {
        setTitle("AI Subscription Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getRootPane().setBorder(new EmptyBorder(10, 10, 10, 10));

        add(buildTopPanel(),    BorderLayout.NORTH);
        add(buildMiddlePanel(), BorderLayout.CENTER);
        add(buildOutputPanel(), BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel buildTopPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Plan Details"));
        GridBagConstraints c = new GridBagConstraints();
        c.insets  = new Insets(4, 6, 4, 6);
        c.anchor  = GridBagConstraints.WEST;

        addLabel(panel, "Model Name:",     c, 0, 0);
        addField(panel, fieldModelName,    c, 1, 0);
        addLabel(panel, "Price (NPR/lakh):", c, 2, 0);
        addField(panel, fieldPrice,        c, 3, 0);

        addLabel(panel, "Context Window:", c, 0, 1);
        addField(panel, fieldContextWindow, c, 1, 1);

        addLabel(panel, "Prompt Quota (Personal):", c, 0, 2);
        addField(panel, fieldPromptQuota,  c, 1, 2);
        addLabel(panel, "Team Slots (Pro):", c, 2, 2);
        addField(panel, fieldTeamSlots,    c, 3, 2);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        JButton btnAddPersonal = new JButton("Add Personal Plan");
        JButton btnAddPro      = new JButton("Add Pro Plan");
        JButton btnDisplayAll  = new JButton("Display All");
        JButton btnClear       = new JButton("Clear Fields");
        JButton btnExport      = new JButton("Export to File");
        JButton btnLoad        = new JButton("Load from File");

        buttons.add(btnAddPersonal);
        buttons.add(btnAddPro);
        buttons.add(btnDisplayAll);
        buttons.add(btnClear);
        buttons.add(btnExport);
        buttons.add(btnLoad);

        c.gridx = 0; c.gridy = 3; c.gridwidth = 4;
        panel.add(buttons, c);
        c.gridwidth = 1;

        btnAddPersonal.addActionListener(e -> addPersonalPlan());
        btnAddPro     .addActionListener(e -> addProPlan());
        btnDisplayAll .addActionListener(e -> displayAll());
        btnClear      .addActionListener(e -> clearFields());
        btnExport     .addActionListener(e -> exportToFile());
        btnLoad       .addActionListener(e -> loadFromFile());

        return panel;
    }

    private JPanel buildMiddlePanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2, 10, 0));
        panel.add(buildPromptPanel());
        panel.add(buildTeamPanel());
        return panel;
    }

    private JPanel buildPromptPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Send a Prompt  (Personal Plan)"));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(4, 6, 4, 6);
        c.anchor = GridBagConstraints.WEST;

        addLabel(panel, "Plan Index:",       c, 0, 0);
        addField(panel, fieldIndex,          c, 1, 0);
        addLabel(panel, "Prompt Text:",      c, 0, 1);
        addField(panel, fieldPromptText,     c, 1, 1);
        addLabel(panel, "Response Length:",  c, 0, 2);
        addField(panel, fieldResponseLength, c, 1, 2);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        JButton btnSend      = new JButton("Send Prompt");
        JButton btnBuyPrompts = new JButton("Buy Prompts");
        JButton btnCheckType = new JButton("Check Plan Type");
        buttons.add(btnSend);
        buttons.add(btnBuyPrompts);
        buttons.add(btnCheckType);

        c.gridx = 0; c.gridy = 3; c.gridwidth = 2;
        panel.add(buttons, c);

        btnSend      .addActionListener(e -> givePrompt());
        btnBuyPrompts.addActionListener(e -> buyMorePrompts());
        btnCheckType .addActionListener(e -> checkPlanType());

        return panel;
    }

    private JPanel buildTeamPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Team Members  (Pro Plan)"));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(4, 6, 4, 6);
        c.anchor = GridBagConstraints.WEST;

        addLabel(panel, "Plan Index:",   c, 0, 0);
        addField(panel, fieldTeamIndex,  c, 1, 0);
        addLabel(panel, "Member Name:",  c, 0, 1);
        addField(panel, fieldMemberName, c, 1, 1);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        JButton btnAdd    = new JButton("Add Member");
        JButton btnRemove = new JButton("Remove Member");
        buttons.add(btnAdd);
        buttons.add(btnRemove);

        c.gridx = 0; c.gridy = 2; c.gridwidth = 2;
        panel.add(buttons, c);

        btnAdd   .addActionListener(e -> addTeamMember());
        btnRemove.addActionListener(e -> removeTeamMember());

        return panel;
    }

    private JPanel buildOutputPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Output"));
        outputArea.setEditable(false);
        outputArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        panel.add(new JScrollPane(outputArea), BorderLayout.CENTER);
        return panel;
    }

    private void addLabel(JPanel p, String text, GridBagConstraints c, int x, int y) {
        c.gridx = x; c.gridy = y;
        p.add(new JLabel(text), c);
    }

    private void addField(JPanel p, JTextField field, GridBagConstraints c, int x, int y) {
        c.gridx = x; c.gridy = y;
        p.add(field, c);
    }
    
    private int getValidIndex(JTextField field) {
        int index = -1;
        try {
            index = Integer.parseInt(field.getText().trim());
            if (index < 0 || index >= plans.size()) {
                JOptionPane.showMessageDialog(this,
                    "Index " + index + " is out of range.\nValid range: 0 to " + (plans.size() - 1),
                    "Invalid Index", JOptionPane.ERROR_MESSAGE);
                return -1;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Please enter a whole number for the index.",
                "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        return index;
    }

    /**
     * Reads the fields and creates a new PersonalPlan, then adds it to the list.
     */
    private void addPersonalPlan() {
        try {
            String name   = fieldModelName.getText().trim();
            double price  = Double.parseDouble(fieldPrice.getText().trim());
            String ctx    = fieldContextWindow.getText().trim();
            int    quota  = Integer.parseInt(fieldPromptQuota.getText().trim());

            if (name.isEmpty() || ctx.isEmpty()) {
                 showError("Model Name and Context Window cannot be empty.");
                return;
            }

            plans.add(new Personalplan(name, price, ctx, quota));
            output("Personal Plan added at index " + (plans.size() - 1) + ".\n" + plans.get(plans.size() - 1).display());

        } catch (NumberFormatException e) {
            showError("Price, Parameters, and Prompt Quota must all be numbers.");
        }
    }

    private void addProPlan() {
        try {
            String name   = fieldModelName.getText().trim();
            double price  = Double.parseDouble(fieldPrice.getText().trim());
            String ctx    = fieldContextWindow.getText().trim();
            int    slots  = Integer.parseInt(fieldTeamSlots.getText().trim());

            if (name.isEmpty() || ctx.isEmpty()) {
                showError("Model Name and Context Window cannot be empty.");
                return;
            }

            plans.add(new Proplan(name, price, ctx, slots));
            output("Pro Plan added at index " + (plans.size() - 1) + ".\n" + plans.get(plans.size() - 1).display());

        } catch (NumberFormatException e) {
            showError("Price and Team Slots must be numbers.");
        }
    }

    private void displayAll() {
        if (plans.isEmpty()) {
            output("No plans added yet.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plans.size(); i++) {
            sb.append("=== Plan [").append(i).append("] ===\n");
            sb.append(plans.get(i).display()).append("\n\n");
        }
        output(sb.toString().trim());
    }

    private void clearFields() {
        fieldModelName.setText("");
        fieldPrice.setText("");
        fieldContextWindow.setText("");
        fieldPromptQuota.setText("");
        fieldTeamSlots.setText("");
        fieldIndex.setText("");
        fieldPromptText.setText("");
        fieldResponseLength.setText("");
        fieldTeamIndex.setText("");
        fieldMemberName.setText("");
    }

    private void givePrompt() {
        int index = getValidIndex(fieldIndex);
        if (index == -1) return;

        AIModel plan = plans.get(index);

        if (plan instanceof Personalplan) {
            Personalplan pp = (Personalplan) plan;
            String promptText = fieldPromptText.getText().trim();
            try {
                int length = Integer.parseInt(fieldResponseLength.getText().trim());
                output(pp.enterPrompt(promptText, length));
            } catch (NumberFormatException e) {
                showError("Response Length must be a whole number.");
            }
        } else {
            showError("Plan [" + index + "] is a Pro Plan.\nSending prompts is only available on Personal Plans.");
        }
    }

    private void buyMorePrompts() {
        int index = getValidIndex(fieldIndex);
        if (index == -1) return;

        AIModel plan = plans.get(index);

        if (plan instanceof Personalplan) {
            Personalplan pp = (Personalplan) plan;
            try {
                int amount = Integer.parseInt(fieldResponseLength.getText().trim());
                output(pp.buyPrompts(amount));
            } catch (NumberFormatException e) {
                showError("Enter the number of prompts to buy in the 'Response Length' field.");
            }
        } else {
            showError("Plan [" + index + "] is a Pro Plan.\nBuying prompts is only for Personal Plans.");
        }
    }

    private void addTeamMember() {
        int index = getValidIndex(fieldTeamIndex);
        if (index == -1) return;

        AIModel plan = plans.get(index);

        if (plan instanceof Proplan) {
            Proplan pp = (Proplan) plan;
            String name = fieldMemberName.getText().trim();
            if (name.isEmpty()) { showError("Please enter a member name."); return; }
            output(pp.addMember(name));
        } else {
            showError("Plan [" + index + "] is a Personal Plan.\nTeam members can only be added to Pro Plans.");
        }
    }

    private void removeTeamMember() {
        int index = getValidIndex(fieldTeamIndex);
        if (index == -1) return;

        AIModel plan = plans.get(index);

        if (plan instanceof Proplan) {
            Proplan pp = (Proplan) plan;
            String name = fieldMemberName.getText().trim();
            if (name.isEmpty()) { showError("Please enter a member name."); return; }
            output(pp.removeMember(name));
        } else {
            showError("Plan [" + index + "] is a Personal Plan.\nTeam features are only available on Pro Plans.");
        }
    }

    private void checkPlanType() {
        int index = getValidIndex(fieldIndex);
        if (index == -1) return;

        AIModel plan = plans.get(index);

        if (plan instanceof Personalplan) {
            output("Plan [" + index + "] is a Personal Plan.");
        } else if (plan instanceof Proplan) {
            output("Plan [" + index + "] is a Pro Plan.");
        } else {
            output("Plan [" + index + "] is an unknown plan type.");
        }
    }

    private void exportToFile() {
        if (plans.isEmpty()) { output("Nothing to export — add some plans first."); return; }

        try (PrintWriter writer = new PrintWriter(new FileWriter("plans.txt"))) {
            for (int i = 0; i < plans.size(); i++) {
                AIModel plan = plans.get(i);
                writer.println("=== Plan [" + i + "] ===");
                writer.println(plan.display());
                writer.println(); // blank line between plans
            }
            output("All plans saved to plans.txt");
        } catch (IOException e) {
            showError("Could not save the file: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("plans.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }

            // Show in a separate window
            JTextArea area = new JTextArea(sb.toString());
            area.setEditable(false);
            area.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));

            JFrame frame = new JFrame("Loaded from plans.txt");
            frame.add(new JScrollPane(area));
            frame.setSize(500, 400);
            frame.setLocationRelativeTo(this);
            frame.setVisible(true);

            output("File loaded successfully.");
        } catch (FileNotFoundException e) {
            showError("plans.txt not found. Please export first.");
        } catch (IOException e) {
            showError("Could not read the file: " + e.getMessage());
        }
    }

    private void output(String message) {
        outputArea.setText(message);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        // Run on the Swing event thread (good practice)
        SwingUtilities.invokeLater(() -> new SubscriptionGUI());
    }
}
