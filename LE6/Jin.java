class Jin extends Decorator{
    Jin(Offering offering){
        this.offering=offering;
    }
    String getName(){
        return offering.getName()+"with Jin" ; }
        int getPrice(){
            return offering.getPrice()+65;
        }
    }
