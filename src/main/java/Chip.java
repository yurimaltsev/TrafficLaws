/*
    Фишка игрока

*/

public class Chip {
    int ChipDirection;
    int ChipNumber;
    int ChipPosition;

    Chip () {
        this.ChipDirection = 1;
        this.ChipNumber = 1;
        this.ChipPosition = 1;

        //TODO: this.ChipNumber = someSessionOrMapVariable.getNextPlayerNumber;
    }

    Chip (int direction, int number, int position) {
        this.ChipDirection = direction;
        this.ChipNumber = number;
        this.ChipPosition = position;
    }

}
