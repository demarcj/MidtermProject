//import java.util.Scanner;



    public class Menu {

        //Scanner deNorLi = new Scanner(System.in);

        // initialise total to start from zero
        String name;
        String category;
        String description;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        double price;

    public Menu(){
        String name = "";
        String category = "";
        String description = "";
        double price = 0;
    }

    public Menu(String name, String category, String description, double price){
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
    }

    Menu food = new Menu("pizza", "Itlian", "osidjdflj", 54.00);

        // American Cusine Menu Items With Prices
        /*
        double surfTurf = 34.50;
        double lambCo = 34.50;
        double southernSoul = 34.50;

        double westernPeel = 26.50;
        double asianWok = 26.25;
        double cajunSkillet = 26.25;

        double mexicanBowl = 24.50;
        double veganSoul = 24.50;
        double seaFoodJack = 24.50;

        double winBuckDepo = 22.50;
        double roastBeefParle = 22.50;
        double burger360 = 18.75;
        */

        //int decide;

        /*public MenuItems(double surfTurf, double lambCo, double southernSoul, double westernPeel,
                         double asianWok, double cajunSkillet, double mexicanBowl, double veganSoul, double seaFoodJack,
                         double winBuckDepo, double roastBeefParle, double burger360) {


            this.total = total;
            this.surfTurf = surfTurf;
            this.lambCo = lambCo;
            this.southernSoul = southernSoul;
            this.westernPeel = westernPeel;
            this.asianWok = asianWok;
            this.cajunSkillet = cajunSkillet;
            this.mexicanBowl = mexicanBowl;
            this.veganSoul = veganSoul;
            this.seaFoodJack = seaFoodJack;
            this.winBuckDepo = winBuckDepo;
            this.roastBeefParle = roastBeefParle;
            this.burger360 = burger360;
            }


            public String toString(){
            return "Great";
            }
    */}



                //System.out.println("|--------------------------------------------|");
                //System.out.println("|                 DeNorLi’s                  |");
                //System.out.println("|--------------------------------------------|");
                //System.out.println("| Menu Item #                    Price       |");
                //System.out.println("|--------------------------------------------|");
                //System.out.println("| 1  Surf & Turf                  34.75      |");
                //System.out.println("| 2  Lamb & Co.                   34.50      |");
                //System.out.println("| 3  Southern Soul                34.50      |");
	            //System.out.println("| 4   Western Peel                26.50      |");
                //System.out.println("| 5  Asian Wok                    26.25      |");
                //System.out.println("| 6  Cajun Skillet                26.25      |");
                //System.out.println("| 7  Mexican Bowl                 24.50      |");
                //System.out.println("| 8  Vegan Soul                   24.50      |");
                //System.out.println("| 9  SeaFood Jack                 24.50      |");
                //System.out.println("| 10 Bucket’o’Wings               22.50      |");
                //System.out.println("| 11 Roast Beef Parle             22.50      |");
                //System.out.println("| 12 360 Mega Burger & Fries      18.75      |");
                //System.out.println("|--------------------------------------------|");
                //System.out.println("| E |           EXIT                         |");
                //System.out.println("|--------------------------------------------|");
                //System.out.println();
                //System.out.println("Enter choice");


