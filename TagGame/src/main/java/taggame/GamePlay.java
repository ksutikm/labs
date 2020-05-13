package taggame;


public class GamePlay {

    private int intsField[];

    public GamePlay() {
        intsField = new int[16];
    }

    public int[] shuffleList() {

        createGame();
//        createPlayingField();
        return intsField;
    }

    private void createGame() {

        do {
            createPlayingField();
        } while (canBeSolved() == false);

    }

    private void createPlayingField() {
        int d;
        for (int i = 1; i < 16; i++) {
            do {
                d = (int) (Math.random()*16);
            } while (intsField[d] != 0);
            intsField[d] = i;
        }
    }

    private boolean canBeSolved() {
        boolean player;

        int sum = 0, n, k = 0, d = 0;

        for (int i = 0; i < 15; i++){
            n = 0;
            for (int j = i+1; j < 16; j++){
                if (intsField[i] > intsField[j] && intsField[j] != 0) n++;
            }
            sum+=n;
        }

        for (int i = 0; i < 16; i++){
            if (intsField[i] == 0) k = i;
        }

        switch (k){
            case 0:
            case 1:
            case 2:
            case 3: d = 1; break;
            case 4:
            case 5:
            case 6:
            case 7: d = 2; break;
            case 8:
            case 9:
            case 10:
            case 11: d = 3; break;
            case 12:
            case 13:
            case 14:
            case 15: d = 4; break;
        }

        sum = sum + d;

        if (sum % 2 == 0) player = true;
        else player = false;

        return player;
    }

}
