/**  COM673 java-refresher GAAFootballTest code.
* @author  Stephen Howell (@stephen-howell)
*/
class GAAFootballTest
{
    public static void main(String[] args) {
        new GAAFootballTest();
    }

    GAAFootballTest()
    {
        // This test has 2 county teams, Louth and Meath
        GAAFootballTeam louth = new GAAFootballTeam("Louth County Team");
        GAAFootballTeam meath = new GAAFootballTeam("Meath County Team");
        // The teams play each other, and Louth scores 4 goals and 7 points
        louth.scoreGoals(4);
        louth.scorePoints(7);
        // meath scores 3 goals and 8 points
        meath.scoreGoals(3);
        meath.scorePoints(8);
        // A goal is worth 3 points, which team won?
        int meathTotal = meath.calculateTotalPoints();
        int louthTotal = louth.calculateTotalPoints();
        if(louthTotal == meathTotal) {
            System.out.println("The match was a draw!");
        }
        else if(louthTotal < meathTotal) {
            System.out.println(meath.getName() + " won!");
        }
        else {
            System.out.println(louth.getName() + " won!");
        }
    }

    private class GAAFootballTeam
    {
        private String name;
        private int goals;
        private int points;
        // Add Constructor
        GAAFootballTeam(String name) {
            this.name = name;
        }
        // Getter method for name
        public String getName() {
            return name;
        }
        // Setter method for goals
        public void scoreGoals(int goals) {
            this.goals = goals;
        }
        // Setter method for points
        public void scorePoints(int points) {
            this.points = points;
        }
        // Helper method to calculate total points and return value
        public int calculateTotalPoints() {
            return (goals * 3) + points;
        }
    }
}