package Coursework;


/**
 * Write a description of class Proplan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Proplan extends AIModel
{
    private int teamSlots;

    public Proplan(String modelName, double price,
                   String contextWindow, int teamSlots) {
        super(modelName, price, contextWindow);
        this.teamSlots = teamSlots;
    }

    public int getTeamSlots() {
        return teamSlots;
    }

    public String addMember(String memberName) {
        if (teamSlots <= 0) {
            return "No slots available. Upgrade your plan to add more team members.";
        }
        teamSlots--;
        return memberName + " has been added to the team! Slots remaining: " + teamSlots;
    }

    public String removeMember(String memberName) {
        teamSlots++;
        return memberName + " has been removed from the team. Slots available: " + teamSlots;
    }

    @Override
    public String display() {
        return super.display() + "\n"
             + "Team Slots    : " + teamSlots + " available";
    }
}
