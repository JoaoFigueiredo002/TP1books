package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        double price = 0;
        int discountBooks=0;

        for ( int i=0; i<books.length;i++){
            if (books[i]==1){
                discountBooks+=1;
            }else if(books[i]>1){
                price+=(books[i]-1)*8;
                discountBooks+=1;
            }    
        }

        switch(discountBooks){
            case 1:
                price += 8;
                break;
            case 2:
                price += 8*2-8*2*0.07;
                break;  
            case 3:
                price += 8*3-8*3*0.14;
                break;  
            case 4:
                price += 8*4-8*4*0.28;
                break;        
            case 5:
                price += 8*5-8*5*0.35;
                break;
            default:
                break;
        }

        return price;
    }
}
