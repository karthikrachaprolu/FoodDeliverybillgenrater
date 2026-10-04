import java.util.Scanner;

class FoodDelivery {

    void generateBill() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("_________________________________________________________");
        System.out.println("----------- WELCOME TO MEGA FOOD DELIVERY APP -----------");
        System.out.println("_________________________________________________________");
        System.out.println("1. Madina Biryani");
        System.out.println("2. Gummadi Grand");
        System.out.println("3. N-Square");
        System.out.println("4. Good Morning");
        System.out.println("5. Robo Restaurant");
        System.out.println("6. Sri Kanya");
        System.out.println("7. Paradise Biryani House");
        System.out.println("8. Pista House");
        System.out.println("9. Kritunga Traditional");
        System.out.println("10. Absolute Barbeque Nation");
        
        System.out.print("\nSelect Restaurant (1-10): ");
        int restaurantSelect = sc.nextInt();

        int totalItemCost = 0;
        String billDetails = ""; 
        int itemSelect = 0;
        int quantity = 0;

        switch (restaurantSelect) {

            // ==========================================
            // 1. MADINA BIRYANI
            // ==========================================
            case 1:
                System.out.println("\n--- MADINA BIRYANI ---");
                
                // STARTERS
                System.out.println("\n[STARTERS]");
                System.out.println("1. Veg Manchuria - ₹90");
                System.out.println("2. Chicken 65 - ₹120");
                System.out.println("3. Chilli Chicken - ₹100");
                System.out.println("4. Chicken Majestic - ₹150");
                System.out.println("5. Paneer 65 - ₹130");
                System.out.println("0. Skip");
                System.out.print("Select Starter: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 90 * quantity;
                        billDetails += "Veg Manchuria x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 120 * quantity;
                        billDetails += "Chicken 65 x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 100 * quantity;
                        billDetails += "Chilli Chicken x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 150 * quantity;
                        billDetails += "Chicken Majestic x" + quantity + "\n";
                        break;
                    case 5:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 130 * quantity;
                        billDetails += "Paneer 65 x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                // BIRYANI
                System.out.println("\n[BIRYANI & MAINS]");
                System.out.println("1. Chicken Dum Biryani - ₹200");
                System.out.println("2. Mutton Biryani - ₹280");
                System.out.println("3. Prawns Biryani - ₹300");
                System.out.println("4. Special Family Pack Biryani - ₹650");
                System.out.println("0. Skip");
                System.out.print("Select Biryani: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 200 * quantity;
                        billDetails += "Chicken Dum Biryani x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 280 * quantity;
                        billDetails += "Mutton Biryani x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 300 * quantity;
                        billDetails += "Prawns Biryani x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 650 * quantity;
                        billDetails += "Family Pack Biryani x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                // DRINKS
                System.out.println("\n[BEVERAGES]");
                System.out.println("1. Thums Up - ₹40");
                System.out.println("2. Sprite - ₹40");
                System.out.println("3. Sweet Lassi - ₹60");
                System.out.println("0. Skip");
                System.out.print("Select Drink: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 40 * quantity;
                        billDetails += "Thums Up x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 40 * quantity;
                        billDetails += "Sprite x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 60 * quantity;
                        billDetails += "Sweet Lassi x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }
                break;

            // ==========================================
            // 2. GUMMADI GRAND
            // ==========================================
            case 2:
                System.out.println("\n--- GUMMADI GRAND ---");
                
                System.out.println("\n[STARTERS]");
                System.out.println("1. Paneer Tikka - ₹150");
                System.out.println("2. Gobi 65 - ₹110");
                System.out.println("3. Mushroom Manchurian - ₹140");
                System.out.println("4. Crispy Corn - ₹120");
                System.out.println("0. Skip");
                System.out.print("Select Starter: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 150 * quantity;
                        billDetails += "Paneer Tikka x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 110 * quantity;
                        billDetails += "Gobi 65 x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 140 * quantity;
                        billDetails += "Mushroom Manchurian x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 120 * quantity;
                        billDetails += "Crispy Corn x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[MAINS]");
                System.out.println("1. Veg Biryani - ₹150");
                System.out.println("2. Special Kaju Biryani - ₹220");
                System.out.println("3. Paneer Butter Masala - ₹180");
                System.out.println("4. Butter Naan - ₹40");
                System.out.println("0. Skip");
                System.out.print("Select Main: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 150 * quantity;
                        billDetails += "Veg Biryani x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 220 * quantity;
                        billDetails += "Special Kaju Biryani x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 180 * quantity;
                        billDetails += "Paneer Butter Masala x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 40 * quantity;
                        billDetails += "Butter Naan x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[DESSERTS & DRINKS]");
                System.out.println("1. Sweet Lassi - ₹60");
                System.out.println("2. Mango Shake - ₹80");
                System.out.println("3. Gulab Jamun (2 pcs) - ₹50");
                System.out.println("0. Skip");
                System.out.print("Select Drink/Dessert: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 60 * quantity;
                        billDetails += "Sweet Lassi x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 80 * quantity;
                        billDetails += "Mango Shake x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 50 * quantity;
                        billDetails += "Gulab Jamun x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }
                break;

            // ==========================================
            // 3. N-SQUARE
            // ==========================================
            case 3:
                System.out.println("\n--- N-SQUARE ---");
                
                System.out.println("\n[STARTERS]");
                System.out.println("1. Spring Rolls - ₹100");
                System.out.println("2. Honey Chilli Potato - ₹130");
                System.out.println("3. Chicken Lollypop - ₹160");
                System.out.println("0. Skip");
                System.out.print("Select Starter: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 100 * quantity;
                        billDetails += "Spring Rolls x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 130 * quantity;
                        billDetails += "Honey Chilli Potato x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 160 * quantity;
                        billDetails += "Chicken Lollypop x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[MAINS]");
                System.out.println("1. Veg Fried Rice - ₹140");
                System.out.println("2. Chicken Noodles - ₹160");
                System.out.println("3. Schezwan Chicken Fried Rice - ₹180");
                System.out.println("0. Skip");
                System.out.print("Select Main: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 140 * quantity;
                        billDetails += "Veg Fried Rice x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 160 * quantity;
                        billDetails += "Chicken Noodles x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 180 * quantity;
                        billDetails += "Schezwan Chicken Fried Rice x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[DESSERTS]");
                System.out.println("1. Chocolate Milkshake - ₹120");
                System.out.println("2. Sizzling Brownie - ₹150");
                System.out.println("3. Vanilla Ice Cream - ₹60");
                System.out.println("0. Skip");
                System.out.print("Select Dessert: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 120 * quantity;
                        billDetails += "Chocolate Milkshake x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 150 * quantity;
                        billDetails += "Sizzling Brownie x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 60 * quantity;
                        billDetails += "Vanilla Ice Cream x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }
                break;

            // ==========================================
            // 4. GOOD MORNING
            // ==========================================
            case 4:
                System.out.println("\n--- GOOD MORNING ---");
                
                System.out.println("\n[SNACKS & TIFFINS]");
                System.out.println("1. Medu Vada (2 pcs) - ₹40");
                System.out.println("2. Mysore Bonda - ₹50");
                System.out.println("3. Masala Dosa - ₹60");
                System.out.println("4. Idli (3 pcs) - ₹40");
                System.out.println("5. Poori (2 pcs) - ₹55");
                System.out.println("0. Skip");
                System.out.print("Select Tiffin: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 40 * quantity;
                        billDetails += "Medu Vada x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 50 * quantity;
                        billDetails += "Mysore Bonda x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 60 * quantity;
                        billDetails += "Masala Dosa x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 40 * quantity;
                        billDetails += "Idli x" + quantity + "\n";
                        break;
                    case 5:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 55 * quantity;
                        billDetails += "Poori x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[HOT BEVERAGES]");
                System.out.println("1. Filter Coffee - ₹30");
                System.out.println("2. Masala Chai - ₹25");
                System.out.println("3. Badam Milk - ₹40");
                System.out.println("0. Skip");
                System.out.print("Select Drink: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 30 * quantity;
                        billDetails += "Filter Coffee x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 25 * quantity;
                        billDetails += "Masala Chai x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 40 * quantity;
                        billDetails += "Badam Milk x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }
                break;

            // ==========================================
            // 5. ROBO RESTAURANT
            // ==========================================
            case 5:
                System.out.println("\n--- ROBO RESTAURANT ---");
                
                System.out.println("\n[SIDES]");
                System.out.println("1. French Fries - ₹80");
                System.out.println("2. Garlic Bread - ₹100");
                System.out.println("3. Cheese Nuggets - ₹120");
                System.out.println("4. Onion Rings - ₹90");
                System.out.println("0. Skip");
                System.out.print("Select Starter: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 80 * quantity;
                        billDetails += "French Fries x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 100 * quantity;
                        billDetails += "Garlic Bread x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 120 * quantity;
                        billDetails += "Cheese Nuggets x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 90 * quantity;
                        billDetails += "Onion Rings x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[FAST FOOD MAINS]");
                System.out.println("1. Veg Cheese Burger - ₹120");
                System.out.println("2. Chicken Pizza (Medium) - ₹250");
                System.out.println("3. Paneer Wrap - ₹140");
                System.out.println("4. White Sauce Pasta - ₹180");
                System.out.println("0. Skip");
                System.out.print("Select Main: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 120 * quantity;
                        billDetails += "Veg Cheese Burger x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 250 * quantity;
                        billDetails += "Chicken Pizza x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 140 * quantity;
                        billDetails += "Paneer Wrap x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 180 * quantity;
                        billDetails += "White Sauce Pasta x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[MOCKTAILS & SHAKES]");
                System.out.println("1. Cold Coffee - ₹90");
                System.out.println("2. Virgin Mojito - ₹110");
                System.out.println("3. Oreo Shake - ₹130");
                System.out.println("0. Skip");
                System.out.print("Select Drink: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 90 * quantity;
                        billDetails += "Cold Coffee x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 110 * quantity;
                        billDetails += "Virgin Mojito x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 130 * quantity;
                        billDetails += "Oreo Shake x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }
                break;

            // ==========================================
            // 6. SRI KANYA
            // ==========================================
            case 6:
                System.out.println("\n--- SRI KANYA ---");
                
                System.out.println("\n[ANDHRA STARTERS]");
                System.out.println("1. Chicken Pakoda - ₹140");
                System.out.println("2. Fish Fry - ₹180");
                System.out.println("3. Prawns Fry - ₹210");
                System.out.println("4. Mutton Keema Balls - ₹200");
                System.out.println("0. Skip");
                System.out.print("Select Starter: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 140 * quantity;
                        billDetails += "Chicken Pakoda x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 180 * quantity;
                        billDetails += "Fish Fry x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 210 * quantity;
                        billDetails += "Prawns Fry x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 200 * quantity;
                        billDetails += "Mutton Keema Balls x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[MEALS & CURRIES]");
                System.out.println("1. Special Veg Thali - ₹150");
                System.out.println("2. Andhra Chicken Curry Meal - ₹220");
                System.out.println("3. Natu Kodi Pulusu - ₹260");
                System.out.println("4. Nellore Fish Curry - ₹240");
                System.out.println("0. Skip");
                System.out.print("Select Main: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 150 * quantity;
                        billDetails += "Special Veg Thali x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 220 * quantity;
                        billDetails += "Chicken Curry Meal x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 260 * quantity;
                        billDetails += "Natu Kodi Pulusu x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 240 * quantity;
                        billDetails += "Nellore Fish Curry x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[COOLERS]");
                System.out.println("1. Masala Buttermilk - ₹40");
                System.out.println("2. Fresh Lime Soda - ₹50");
                System.out.println("0. Skip");
                System.out.print("Select Drink: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 40 * quantity;
                        billDetails += "Masala Buttermilk x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 50 * quantity;
                        billDetails += "Fresh Lime Soda x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }
                break;

            // ==========================================
            // 7. PARADISE BIRYANI HOUSE
            // ==========================================
            case 7:
                System.out.println("\n--- PARADISE BIRYANI HOUSE ---");
                
                System.out.println("\n[KEBABS & STARTERS]");
                System.out.println("1. Reshmi Kebab - ₹220");
                System.out.println("2. Chicken Tikka Kebab - ₹210");
                System.out.println("3. Mutton Seekh Kebab - ₹280");
                System.out.println("4. Paneer Tikka Kebab - ₹190");
                System.out.println("0. Skip");
                System.out.print("Select Starter: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 220 * quantity;
                        billDetails += "Reshmi Kebab x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 210 * quantity;
                        billDetails += "Chicken Tikka Kebab x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 280 * quantity;
                        billDetails += "Mutton Seekh Kebab x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 190 * quantity;
                        billDetails += "Paneer Tikka Kebab x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[ROYAL BIRYANI]");
                System.out.println("1. Nizami Chicken Biryani - ₹320");
                System.out.println("2. Royal Mutton Biryani - ₹380");
                System.out.println("3. Veg Dum Biryani - ₹240");
                System.out.println("4. Special Egg Biryani - ₹260");
                System.out.println("0. Skip");
                System.out.print("Select Main: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 320 * quantity;
                        billDetails += "Nizami Chicken Biryani x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 380 * quantity;
                        billDetails += "Royal Mutton Biryani x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 240 * quantity;
                        billDetails += "Veg Dum Biryani x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 260 * quantity;
                        billDetails += "Special Egg Biryani x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[DESSERTS]");
                System.out.println("1. Qubani Ka Meetha - ₹120");
                System.out.println("2. Double Ka Meetha - ₹110");
                System.out.println("3. Falooda - ₹150");
                System.out.println("0. Skip");
                System.out.print("Select Dessert: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 120 * quantity;
                        billDetails += "Qubani Ka Meetha x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 110 * quantity;
                        billDetails += "Double Ka Meetha x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 150 * quantity;
                        billDetails += "Falooda x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }
                break;

            // ==========================================
            // 8. PISTA HOUSE
            // ==========================================
            case 8:
                System.out.println("\n--- PISTA HOUSE ---");
                
                System.out.println("\n[FAMOUS HALEEM & SNACKS]");
                System.out.println("1. Mutton Haleem (Regular) - ₹250");
                System.out.println("2. Chicken Haleem - ₹200");
                System.out.println("3. Veg Samosa (2 pcs) - ₹40");
                System.out.println("4. Onion Pakoda - ₹60");
                System.out.println("0. Skip");
                System.out.print("Select Item: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 250 * quantity;
                        billDetails += "Mutton Haleem x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 200 * quantity;
                        billDetails += "Chicken Haleem x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 40 * quantity;
                        billDetails += "Veg Samosa x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 60 * quantity;
                        billDetails += "Onion Pakoda x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[MAINS & BREADS]");
                System.out.println("1. Zafrani Chicken Biryani - ₹310");
                System.out.println("2. Mutton Mandi (Half) - ₹550");
                System.out.println("3. Rumali Roti - ₹25");
                System.out.println("4. Butter Chicken - ₹280");
                System.out.println("0. Skip");
                System.out.print("Select Main: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 310 * quantity;
                        billDetails += "Zafrani Chicken Biryani x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 550 * quantity;
                        billDetails += "Mutton Mandi x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 25 * quantity;
                        billDetails += "Rumali Roti x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 280 * quantity;
                        billDetails += "Butter Chicken x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[BAKERY & SWEETS]");
                System.out.println("1. Zafrani Chai - ₹40");
                System.out.println("2. Osmania Biscuit (Pack) - ₹80");
                System.out.println("3. Fruit Biscuit (Pack) - ₹90");
                System.out.println("0. Skip");
                System.out.print("Select Dessert: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 40 * quantity;
                        billDetails += "Zafrani Chai x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 80 * quantity;
                        billDetails += "Osmania Biscuit x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 90 * quantity;
                        billDetails += "Fruit Biscuit x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }
                break;

            // ==========================================
            // 9. KRITUNGA TRADITIONAL
            // ==========================================
            case 9:
                System.out.println("\n--- KRITUNGA TRADITIONAL ---");
                
                System.out.println("\n[SPICY STARTERS]");
                System.out.println("1. Rayalaseema Kodi Vepudu - ₹220");
                System.out.println("2. Guntur Mirchi Bajji - ₹60");
                System.out.println("3. Mutton Roast - ₹290");
                System.out.println("4. Gobi Manchurian - ₹140");
                System.out.println("0. Skip");
                System.out.print("Select Starter: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 220 * quantity;
                        billDetails += "Rayalaseema Kodi Vepudu x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 60 * quantity;
                        billDetails += "Guntur Mirchi Bajji x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 290 * quantity;
                        billDetails += "Mutton Roast x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 140 * quantity;
                        billDetails += "Gobi Manchurian x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[TRADITIONAL MAINS]");
                System.out.println("1. Potlam Biryani - ₹320");
                System.out.println("2. Ragi Sangati with Natukodi - ₹350");
                System.out.println("3. Ulavacharu Chicken Biryani - ₹340");
                System.out.println("4. Gutti Vankaya Curry - ₹190");
                System.out.println("5. Jonna Rotte (2 pcs) - ₹60");
                System.out.println("0. Skip");
                System.out.print("Select Main: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 320 * quantity;
                        billDetails += "Potlam Biryani x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 350 * quantity;
                        billDetails += "Ragi Sangati with Natukodi x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 340 * quantity;
                        billDetails += "Ulavacharu Chicken Biryani x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 190 * quantity;
                        billDetails += "Gutti Vankaya Curry x" + quantity + "\n";
                        break;
                    case 5:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 60 * quantity;
                        billDetails += "Jonna Rotte x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }
                
                System.out.println("\n[COOLERS]");
                System.out.println("1. Nannari Sarbath - ₹50");
                System.out.println("2. Rose Milk - ₹60");
                System.out.println("0. Skip");
                System.out.print("Select Drink: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 50 * quantity;
                        billDetails += "Nannari Sarbath x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 60 * quantity;
                        billDetails += "Rose Milk x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }
                break;

            // ==========================================
            // 10. ABSOLUTE BARBEQUE NATION
            // ==========================================
            case 10:
                System.out.println("\n--- ABSOLUTE BARBEQUE NATION ---");
                
                System.out.println("\n[GRILLS & BBQ STARTERS]");
                System.out.println("1. Tandoori Prawns - ₹350");
                System.out.println("2. Grilled Mutton Chops - ₹400");
                System.out.println("3. Peri Peri Chicken Wings - ₹280");
                System.out.println("4. Cajun Spiced Potato - ₹190");
                System.out.println("5. BBQ Pineapple - ₹150");
                System.out.println("0. Skip");
                System.out.print("Select Grill: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 350 * quantity;
                        billDetails += "Tandoori Prawns x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 400 * quantity;
                        billDetails += "Grilled Mutton Chops x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 280 * quantity;
                        billDetails += "Peri Peri Chicken Wings x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 190 * quantity;
                        billDetails += "Cajun Spiced Potato x" + quantity + "\n";
                        break;
                    case 5:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 150 * quantity;
                        billDetails += "BBQ Pineapple x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[BUFFET MAINS]");
                System.out.println("1. Mutton Rogan Josh - ₹380");
                System.out.println("2. Dal Makhani - ₹220");
                System.out.println("3. Garlic Naan - ₹50");
                System.out.println("4. Chicken Tikka Masala - ₹320");
                System.out.println("0. Skip");
                System.out.print("Select Main: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 380 * quantity;
                        billDetails += "Mutton Rogan Josh x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 220 * quantity;
                        billDetails += "Dal Makhani x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 50 * quantity;
                        billDetails += "Garlic Naan x" + quantity + "\n";
                        break;
                    case 4:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 320 * quantity;
                        billDetails += "Chicken Tikka Masala x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }

                System.out.println("\n[PREMIUM DESSERTS]");
                System.out.println("1. Angoori Gulab Jamun - ₹140");
                System.out.println("2. Moong Dal Halwa - ₹160");
                System.out.println("3. Chocolate Brownie with Ice Cream - ₹200");
                System.out.println("0. Skip");
                System.out.print("Select Dessert: ");
                itemSelect = sc.nextInt();
                
                switch (itemSelect) {
                    case 1:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 140 * quantity;
                        billDetails += "Angoori Gulab Jamun x" + quantity + "\n";
                        break;
                    case 2:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 160 * quantity;
                        billDetails += "Moong Dal Halwa x" + quantity + "\n";
                        break;
                    case 3:
                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();
                        totalItemCost += 200 * quantity;
                        billDetails += "Brownie with Ice Cream x" + quantity + "\n";
                        break;
                    case 0:
                        break;
                }
                break;

            default:
                System.out.println("Invalid Restaurant Selection. Exiting...");
                sc.close();
                return;
        }

        // ==========================================
        // FINAL BILLING CALCULATION
        // ==========================================
        
        // If the user skipped everything, exit early
        if (totalItemCost == 0) {
            System.out.println("\nYou didn't order anything. Have a great day!");
            sc.close();
            return;
        }

        int tax = 10;
        int platformFee = 15; // Increased platform fee slightly
        int gst = (totalItemCost * 5) / 100;
        int deliveryCharges = 35; // Standard delivery charge

        double subTotal = totalItemCost + tax + gst + platformFee + deliveryCharges;
        double discountAmount = 0.0;
        
        // Applying logic: 10% discount only if order is above ₹500
        if (totalItemCost > 500) {
            discountAmount = subTotal * 0.10; 
        }
        
        double finalBill = subTotal - discountAmount;

        System.out.println("\n==================================");
        System.out.println("            FINAL BILL            ");
        System.out.println("==================================");
        System.out.println("Items Ordered:");
        System.out.print(billDetails); // Prints all accumulated items and quantities
        System.out.println("----------------------------------");
        System.out.println("Food Cost: ₹" + totalItemCost);
        System.out.println("Tax: ₹" + tax);
        System.out.println("Platform Fee: ₹" + platformFee);
        System.out.println("GST (5%): ₹" + gst);
        System.out.println("Delivery Charges: ₹" + deliveryCharges);
        System.out.println("----------------------------------");
        System.out.println("Subtotal: ₹" + subTotal);
        if (discountAmount > 0) {
            System.out.println("Discount (10% on >₹500): -₹" + String.format("%.2f", discountAmount));
        } else {
            System.out.println("Discount: ₹0 (Add items worth >₹500 for 10% off)");
        }
        System.out.println("----------------------------------");
        System.out.println("Total Amount Payable: ₹" + String.format("%.2f", finalBill));
        System.out.println("==================================");
        System.out.println("   Thank you for ordering!   ");

        sc.close();
    }

    public static void main(String[] args) {
        FoodDelivery fd = new FoodDelivery();
        fd.generateBill();
    }
}