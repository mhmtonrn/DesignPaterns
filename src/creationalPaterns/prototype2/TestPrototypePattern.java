package creationalPaterns.prototype2;

import creationalPaterns.prototype2.PrototypeFactory.ModelType;

public class TestPrototypePattern
{
    public static void main(String[] args)
    {
        try
        {
            String moviePrototype  = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
            System.out.println(moviePrototype);
 
            String albumPrototype  = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
            System.out.println(albumPrototype);
 
            String showPrototype  = PrototypeFactory.getInstance(ModelType.SHOW).toString();
            System.out.println(showPrototype);
 
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}