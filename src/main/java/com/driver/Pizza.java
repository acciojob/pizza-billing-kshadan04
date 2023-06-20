package com.driver;

public class Pizza {

    private int price =0;
    private Boolean isVeg;
    private String bill="";

    private boolean isCheeseAddedOnce = false;
    private boolean isToppingAddedOnce = false;
    private boolean isPaperBagAdded = false;

    private int vegPizzaBasePrice = 300;
    private int NonvegPizzaBasePrice = 400;
    private int extraCheesePrice = 80;
    private int extraToppingsVegPrice = 70;
    private int extraToppingsNonVegPrice = 120;
    private int TakeAwayPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        // your code goes here
        if(isVeg == true){
            price += vegPizzaBasePrice;
            this.bill += "Base Price Of The Pizza: " + vegPizzaBasePrice+"\n";
        }
        else{
            price += NonvegPizzaBasePrice;
            this.bill += "Base Price Of The Pizza: "+ NonvegPizzaBasePrice+"\n";
        }
    }


    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAddedOnce == false){
            this.price += extraCheesePrice;
            isCheeseAddedOnce = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAddedOnce == false){
            if(isVeg == true){
                this.price += extraToppingsVegPrice;
            }
            else{
                this.price += extraToppingsNonVegPrice;
            }
            isToppingAddedOnce = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded == false){
            this.price += TakeAwayPrice;
            isPaperBagAdded = true;
        }



    }

    public String getBill(){
        // your code goes her
        if(isCheeseAddedOnce == true){
            this.bill = this.bill + "Extra Cheese Added: " + extraCheesePrice + "\n";
        }

        if(isToppingAddedOnce == true){
            if(isVeg == true){
                this.bill = this.bill + "Extra Toppings Added: " + extraToppingsVegPrice +"\n";
            } else {
                this.bill = this.bill + "Extra Toppings Added: " + extraToppingsNonVegPrice +"\n";
            }
        }

        if(isPaperBagAdded == true){
            this.bill = this.bill + "Paperbag Added: " + TakeAwayPrice +"\n";
        }
        this.bill = this.bill + "Total price: " + this.price;
        return this.bill;
    }
}
