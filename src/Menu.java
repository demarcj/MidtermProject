import java.text.DecimalFormat;



    public class Menu {

    	private static DecimalFormat df2 = new DecimalFormat("#.00");
        private String name;
        private String category;
        private String description;
        private double price;

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


            public String toString(){
            return name + "\t" + category + "\t$" + df2.format(price);
            }
    }



                //System.out.println("|--------------------------------------------|");
                //System.out.println("|                 DeNorLi’s                |");
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
                

