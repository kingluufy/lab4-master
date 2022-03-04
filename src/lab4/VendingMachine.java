package lab4;
/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class VendingMachine {
        // TODO: implement this class
        private String[] elementStock = new String[] {"Cheetos Crunchy", "Coke", "Doritos Nacho Cheese", "Red Bull"};
        private String output;
        public VendingMachine (){
                output = "Empty VM Started";
        }
        private String[] amountStock = new String[] {"0","0","0","0"};


        public String getMessage() {
                return this.output;
        }
        public String checkStock(){
                String returns = "";
                for(int i = 0; i < elementStock.length; i++){
                        returns = returns + elementStock[i] + " ("+ amountStock[i] + ")";
                        if ( i < elementStock.length - 1){
                                returns = returns + ", ";
                        }
                }
                return "Stock: "+ returns;
        }
        public String checkStock(String object) {
                boolean check = false;
                String total = "";
                String returns = "Invalid product: " + object;
                for (int i = 0; i < elementStock.length; i++){
                        if(elementStock[i].equals(object))
                        {
                                check = true;
                                total = amountStock[i];
                                returns = object + " ("+ total + ")";
                        }
                }
                return returns;
        }


        public void add(String object, int total) {
                this.output = "Invalid product: "+ object;
                for(int i = 0; i < elementStock.length; i++){
                        if(elementStock[i].equals(object)){
                                int pTotal = Integer.parseInt(amountStock[i]) + total;
                                String fTotal = Integer.toString(pTotal);
                                amountStock[i] = fTotal;
                                this.output = "Product added: "+object + " ("+ total +")";
                        }
                }
        }

        public void dispense(String object, int total) {
                this.output = "Invalid product: "+ object;
                for(int i = 0; i < elementStock.length; i++){
                        if(elementStock[i].equals(object)){
                                int pTotal = Integer.parseInt(amountStock[i]) - total;
                                String fTotal = Integer.toString(pTotal);
                                amountStock[i] = fTotal;
                                this.output = "Product removed: "+object + " ("+ total +")";
                        }
                }
        }
}
