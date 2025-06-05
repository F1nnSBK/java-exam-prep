package generics_02;

public class Crate<T extends Bottle> {

    private T box1;
    private T box2;
    private T box3;
    private T box4;
    private T box5;
    private T box6;

    public void insertBottle(T bottle, int box) throws CrateIndexOutOfBoundsException {
        
        if (box < 1 || box > 6) {
            throw new CrateIndexOutOfBoundsException();
        }

        switch (box) {
            case 1:
                box1 = bottle;
                break;
            case 2:
                box2 = bottle;
                break;
            case 3:
                box3 = bottle;
                break;
            case 4:
                box4 = bottle;
                break;
            case 5:
                box5 = bottle;
                break;
            case 6:
                box6 = bottle;
                break;
        
            default:
                break;
        }

    }

    public T takeBottle(int box) throws CrateIndexOutOfBoundsException {

        if (box < 1 || box > 6) {
            throw new CrateIndexOutOfBoundsException();
        }
        
        switch (box) {
            case 1:
                return box1;
            case 2:
                return box2;
            case 3:
                return box3;
            case 4:
                return box4;
            case 5:
                return box5;
            case 6:
                return box6;
        
            default:
                return null;
        }
    }
    
}