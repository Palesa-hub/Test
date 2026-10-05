//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // 2D array containing the sales data
        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        // Single-dimensional array for city names
        String[] cities = {
                "CAPE TOWN",
                "PORT ELIZABETH",
                "PRETORIA"
        };

        // Single-dimensional array for total sales per city
        int[] cityTotals = new int[3];

        // Calculate total sales for each city
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                cityTotals[i] += sales[i][j];
            }
        }

        // Display report
        System.out.println("---------------------------------------------");
        System.out.println("           GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------");

        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < cityTotals.length; i++) {
            System.out.printf("%-20s %d%n",
                    cities[i], cityTotals[i]);
        }

        // Find city with the most sales
        int highestSales = cityTotals[0];
        String cityWithMostSales = cities[0];

        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > highestSales) {
                highestSales = cityTotals[i];
                cityWithMostSales = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);

        System.out.println("---------------------------------------------");
    }
}



