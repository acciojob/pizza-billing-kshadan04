package com.driver;

public class Pizza {

    private int price =0;
    private Boolean isVeg;
    private String bill="";

    boolean isCheeseAddedOnce = false;
    boolean isToppingAddedOnce = false;
    boolean isPaperBagAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        // your code goes here
        if(isVeg == true){
            price += 300;
            this.bill += "Base Price Of The Pizza: 300\n";
        }
        else{
            price += 400;
            this.bill += "Base Price Of The Pizza: 400\n";
        }
    }


    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAddedOnce == false){
            this.price += 80;
            isCheeseAddedOnce = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAddedOnce == false){
            if(isVeg == true){
                this.price += 70;
            }
            else{
                this.price += 120;
            }
            isToppingAddedOnce = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded == false){
            this.price += 20;
            isPaperBagAdded = true;
        }



    }

    public String getBill(){
        // your code goes her
        if(isCheeseAddedOnce == true){
            this.bill = this.bill + "Extra Cheese Added: 80" + "\n";
        }

        if(isToppingAddedOnce == true){
            if(isVeg == true){
                this.bill += "Extra Toppings Added: 70\n";
            }
            else{
                this.bill += "Extra Toppings Added: 120\n";
            }
        }

        if(isPaperBagAdded == true){
            this.bill += "Paperbag Added: 20\n";
        }
        this.bill += "Total Price: " + price;
        return this.bill;
    }
}
