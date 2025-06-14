package generics_01;

public class Crate {

    private Bottle box1;
    private Bottle box2;
    private Bottle box3;
    private Bottle box4;
    private Bottle box5;
    private Bottle box6;

    public void insertBottle(Bottle bottle, int box) throws CrateIndexOutOfBoundsException {
        
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

    public Bottle takeBottle(int box) throws CrateIndexOutOfBoundsException {

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