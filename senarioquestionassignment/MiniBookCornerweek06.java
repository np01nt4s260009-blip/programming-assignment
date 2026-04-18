public class MiniBookCornerweek06 {
    public static void main(String[] args) {
        
        String[] categories = {"Fiction", "Nepali"};
        String[] [] titles = new String[2][1];
        double[][] prices = new double [2] [1];
        
        titles [0] [0] = "The Alchemist";
        prices [0] [0] = 700.0;
        
        titles [1] [0] = "Ashamati-5";
        prices [1] [0] = 950.0;
        System.out.println("Book Corner");
        
        
        for (int i = 0; i < categories.length;i++) {
            System.out.println("Categories" + categories[i]);
            System.out.println("Title" + titles[i] [0]);
              System.out.println("Price: %2f\n " + prices[i][0]);
            System.out.println();
        }
    }
}