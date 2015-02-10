package homework.model;

public enum PlayerPiece {

    TOP_HAT, CAR, CANNON, HORSE, THIMBLE, DOG, IRON, WHEEL_BARROW, SHIP, SHOE;


    public static String prettyPrint(PlayerPiece matchMe) {
        if ( matchMe.toString().equalsIgnoreCase( TOP_HAT.toString() ) ) {
            return "Top Hat";
        } else if ( matchMe.toString().equalsIgnoreCase( CAR.toString() ) ) {
            return "Car";
        } else if ( matchMe.toString().equalsIgnoreCase( CANNON.toString() ) ) {
            return "Cannon";
        } else if ( matchMe.toString().equalsIgnoreCase( HORSE.toString() ) ) {
            return "Horse";
        } else if ( matchMe.toString().equalsIgnoreCase( THIMBLE.toString() ) ) {
            return "Thimble";
        } else if ( matchMe.toString().equalsIgnoreCase( DOG.toString() ) ) {
            return "Dog";
        } else if ( matchMe.toString().equalsIgnoreCase( IRON.toString() ) ) {
            return "Iron";
        } else if ( matchMe.toString().equalsIgnoreCase( WHEEL_BARROW.toString() ) ) {
            return "Wheel Barrow";
        } else if ( matchMe.toString().equalsIgnoreCase( SHIP.toString() ) ) {
            return "Ship";
        } else if ( matchMe.toString().equalsIgnoreCase( SHOE.toString() ) ) {
            return "Shoe";
        } else {

            return "Piece not found";
        }
    }

    public static PlayerPiece getPiece(String matchMe)  {
        if ( matchMe.toString().equalsIgnoreCase( "Top Hat") ) {
            return TOP_HAT;
        } else if ( matchMe.toString().equalsIgnoreCase( "Car") ) {
            return CAR;
        } else if ( matchMe.toString().equalsIgnoreCase( "Cannon" ) ) {
            return CANNON;
        } else if ( matchMe.toString().equalsIgnoreCase( "Horse" ) ) {
            return HORSE;
        } else if ( matchMe.toString().equalsIgnoreCase( "Thimble" ) ) {
            return THIMBLE;
        } else if ( matchMe.toString().equalsIgnoreCase( "Dog" ) ) {
            return DOG;
        } else if ( matchMe.toString().equalsIgnoreCase( "Iron") ) {
            return IRON;
        } else if ( matchMe.toString().equalsIgnoreCase( "Wheel Barrow" ) ) {
            return WHEEL_BARROW;
        } else if ( matchMe.toString().equalsIgnoreCase("Ship"  ) ) {
            return SHIP;
        } else if ( matchMe.toString().equalsIgnoreCase( "Shoe" ) ) {
            return SHOE;
        } else {

            return null;
        }
    }



}
