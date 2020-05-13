package taggame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.input.*;
import javafx.scene.text.Text;

import java.io.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class GameController implements Initializable{

    @FXML
    private VBox vBox;
    @FXML
    private HBox hBox1;
    @FXML
    private HBox hBox2;
    @FXML
    private HBox hBox3;
    @FXML
    private HBox hBox4;
    @FXML
    private VBox vBoxMenu;
    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Button btn4;
    @FXML
    public Button btn5;
    @FXML
    public Button btn6;
    @FXML
    public Button btn7;
    @FXML
    public Button btn8;
    @FXML
    public Button btn9;
    @FXML
    public Button btn10;
    @FXML
    public Button btn11;
    @FXML
    public Button btn12;
    @FXML
    public Button btn13;
    @FXML
    public Button btn14;
    @FXML
    public Button btn15;
    @FXML
    public Button btn16;

    @FXML
    private Text winer;
    @FXML
    private Text countText;
    @FXML
    private Text countNumber;


    private ButtonsList buttonsList = new ButtonsList();
    private int[] a = new int[16];
    private int buf, numButton;
    private int countNum = 0;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        winer.setVisible(false);
        countText.setVisible(false);
        countNumber.setVisible(false);
        vBox.setVisible(false);

    }

    private int digits[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
    private boolean Winner() {

        writeFileData();
        for (int i = 0; i < 16; i++) {
            if (digits[i] != a[i]) {
                return false;
            }
        }
        vBox.setVisible(false);

        return true;
    }

    @FXML
    public void continueButtonAction(ActionEvent actionEvent) {
        try {
            Scanner sc = new Scanner(new File("src/main/resources/taggame/data.txt"));
            String []str;
            str = sc.nextLine().split(" ");
            countNum = Integer.parseInt(str[0]);
            for(int i = 0; i < 16; i++) {
                a[i] = Integer.parseInt(str[i + 1]);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("К сожалению, данные из файла не загрузились.");
        }

        vBox.setVisible(true);

        createBtns();
    }

    private void writeFileData() {
        File file = new File("src/main/resources/taggame/data.txt");

        // Создание файла
        try {
            file.createNewFile();
            // Создание объекта FileWriter
            FileWriter writer = new FileWriter(file);

            // Запись содержимого в файл
            writer.write(Integer.toString(numButton));
            writer.write(" ");
            for(int i = 0; i < 16; i++) {
                writer.write(Integer.toString(a[i]));
                writer.write(" ");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @FXML
    public void startButtonAction(ActionEvent actionEvent) {

        vBox.setVisible(true);
        countNum = 0;
        winer.setVisible(false);
        countText.setVisible(false);
        countNumber.setVisible(false);
        buttonsList.shuffle();
        a = buttonsList.getButtonsList();
        writeFileData();
        createBtns();
    }

    private void createBtns() {
        if (a[0] != 0) {
            btn1.setText(Integer.toString(a[0]));
        } else {
            btn1.setText("");
        }
        if (a[1] != 0) {
            btn2.setText(Integer.toString(a[1]));
        } else {
            btn2.setText("");
        }
        if (a[2] != 0) {
            btn3.setText(Integer.toString(a[2]));
        } else {
            btn3.setText("");
        }
        if (a[3] != 0) {
            btn4.setText(Integer.toString(a[3]));
        } else {
            btn4.setText("");
        }
        if (a[4] != 0) {
            btn5.setText(Integer.toString(a[4]));
        } else {
            btn5.setText("");
        }
        if (a[5] != 0) {
            btn6.setText(Integer.toString(a[5]));
        } else {
            btn6.setText("");
        }
        if (a[6] != 0) {
            btn7.setText(Integer.toString(a[6]));
        } else {
            btn7.setText("");
        }
        if (a[7] != 0) {
            btn8.setText(Integer.toString(a[7]));
        } else {
            btn8.setText("");
        }
        if (a[8] != 0) {
            btn9.setText(Integer.toString(a[8]));
        } else {
            btn9.setText("");
        }
        if (a[9] != 0) {
            btn10.setText(Integer.toString(a[9]));
        } else {
            btn10.setText("");
        }
        if (a[10] != 0) {
            btn11.setText(Integer.toString(a[10]));
        } else {
            btn11.setText("");
        }
        if (a[11] != 0) {
            btn12.setText(Integer.toString(a[11]));
        } else {
            btn12.setText("");
        }
        if (a[12] != 0) {
            btn13.setText(Integer.toString(a[12]));
        } else {
            btn13.setText("");
        }
        if (a[13] != 0) {
            btn14.setText(Integer.toString(a[13]));
        } else {
            btn14.setText("");
        }
        if (a[14] != 0) {
            btn15.setText(Integer.toString(a[14]));
        } else {
            btn15.setText("");
        }
        if (a[15] != 0) {
            btn16.setText(Integer.toString(a[15]));
        } else {
            btn16.setText("");
        }
    }

    @FXML
    public void btn1Action(MouseEvent me) {
        if (me.getClickCount() == 2){
            countNum++;
            numButton = 0;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn1.setText("");
                btn2.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn1.setText("");
                btn5.setText(Integer.toString(a[numButton + 4]));

            }

        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn1Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 0;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn1.setText("");
                btn2.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn1.setText("");
                btn5.setText(Integer.toString(a[numButton + 4]));

            }

        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn2Action(MouseEvent me) {
        if (me.getClickCount() == 2) {
            countNum++;
            numButton = 1;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn2.setText("");
                btn1.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn2.setText("");
                btn3.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn2.setText("");
                btn6.setText(Integer.toString(a[numButton + 4]));
            }

        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn2Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 1;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn2.setText("");
                btn1.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn2.setText("");
                btn3.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn2.setText("");
                btn6.setText(Integer.toString(a[numButton + 4]));
            }

        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn3Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            countNum++;
            numButton = 2;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn3.setText("");
                btn2.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn3.setText("");
                btn4.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn3.setText("");
                btn7.setText(Integer.toString(a[numButton + 4]));
            }

        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn3Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 2;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn3.setText("");
                btn2.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn3.setText("");
                btn4.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn3.setText("");
                btn7.setText(Integer.toString(a[numButton + 4]));
            }

        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn4Action(MouseEvent me) {
        if (me.getClickCount() == 2){
            countNum++;
            numButton = 3;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn4.setText("");
                btn3.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn4.setText("");
                btn8.setText(Integer.toString(a[numButton + 4]));

            }

        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn4Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 3;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn4.setText("");
                btn3.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn4.setText("");
                btn8.setText(Integer.toString(a[numButton + 4]));

            }

        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn5Action(MouseEvent me) {
        if (me.getClickCount() == 2){
            countNum++;
            numButton = 4;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn5.setText("");
                btn6.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton-4] == 0){
                int buf;
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn5.setText("");
                btn1.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn5.setText("");
                btn9.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn5Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 4;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn5.setText("");
                btn6.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton-4] == 0){
                int buf;
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn5.setText("");
                btn1.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn5.setText("");
                btn9.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn6Action(MouseEvent me) {
        if (me.getClickCount() == 2){
            countNum++;
            numButton = 5;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn6.setText("");
                btn2.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn6.setText("");
                btn5.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn6.setText("");
                btn7.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn6.setText("");
                btn10.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn6Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 5;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn6.setText("");
                btn2.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn6.setText("");
                btn5.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn6.setText("");
                btn7.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn6.setText("");
                btn10.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn7Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2){
            countNum++;
            numButton = 6;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn7.setText("");
                btn3.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn7.setText("");
                btn6.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn7.setText("");
                btn8.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn7.setText("");
                btn11.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn7Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 6;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn7.setText("");
                btn3.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn7.setText("");
                btn6.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn7.setText("");
                btn8.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn7.setText("");
                btn11.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn8Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            countNum++;
            numButton = 7;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn8.setText("");
                btn4.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn8.setText("");
                btn7.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn8.setText("");
                btn12.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn8Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 7;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn8.setText("");
                btn4.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn8.setText("");
                btn7.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn8.setText("");
                btn12.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn9Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            countNum++;
            numButton = 8;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn9.setText("");
                btn10.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton-4] == 0){
                int buf;
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn9.setText("");
                btn5.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn9.setText("");
                btn13.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn9Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 8;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn9.setText("");
                btn10.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton-4] == 0){
                int buf;
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn9.setText("");
                btn5.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn9.setText("");
                btn13.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn10Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            countNum++;
            numButton = 9;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn10.setText("");
                btn6.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn10.setText("");
                btn9.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn10.setText("");
                btn11.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn10.setText("");
                btn14.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn10Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 9;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn10.setText("");
                btn6.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn10.setText("");
                btn9.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn10.setText("");
                btn11.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn10.setText("");
                btn14.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn11Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            countNum++;
            numButton = 10;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn11.setText("");
                btn7.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn11.setText("");
                btn10.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn11.setText("");
                btn12.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn11.setText("");
                btn15.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn11Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 10;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn11.setText("");
                btn7.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn11.setText("");
                btn10.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn11.setText("");
                btn12.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn11.setText("");
                btn15.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn12Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            countNum++;
            numButton = 11;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn12.setText("");
                btn8.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn12.setText("");
                btn11.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn12.setText("");
                btn16.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn12Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 11;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn12.setText("");
                btn8.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn12.setText("");
                btn11.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn12.setText("");
                btn16.setText(Integer.toString(a[numButton + 4]));
            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn13Action(MouseEvent me) {
        if (me.getClickCount() == 2) {
            countNum++;
            numButton = 12;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn13.setText("");
                btn9.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn13.setText("");
                btn14.setText(Integer.toString(a[numButton + 1]));

            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn13Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 12;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn13.setText("");
                btn9.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn13.setText("");
                btn14.setText(Integer.toString(a[numButton + 1]));

            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn14Action(MouseEvent me) {
        if (me.getClickCount() == 2) {
            countNum++;
            numButton = 13;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn14.setText("");
                btn13.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn14.setText("");
                btn10.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn14.setText("");
                btn15.setText(Integer.toString(a[numButton + 1]));

            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn14Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 13;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn14.setText("");
                btn13.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn14.setText("");
                btn10.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn14.setText("");
                btn15.setText(Integer.toString(a[numButton + 1]));

            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn15Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            countNum++;
            numButton = 14;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn15.setText("");
                btn14.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn15.setText("");
                btn11.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn15.setText("");
                btn16.setText(Integer.toString(a[numButton + 1]));

            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn15Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 14;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn15.setText("");
                btn14.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn15.setText("");
                btn11.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn15.setText("");
                btn16.setText(Integer.toString(a[numButton + 1]));

            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn16Action(MouseEvent me) {
        if (me.getClickCount() == 2) {
            countNum++;
            numButton = 15;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn16.setText("");
                btn15.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn16.setText("");
                btn12.setText(Integer.toString(a[numButton-4]));

            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }

    @FXML
    public void btn16Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            countNum++;
            numButton = 15;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn16.setText("");
                btn15.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn16.setText("");
                btn12.setText(Integer.toString(a[numButton-4]));

            }
        }
        if (Winner()) {
            winer.setVisible(true);
            countText.setVisible(true);
            countNumber.setText(Integer.toString(countNum));
            countNumber.setVisible(true);
        }
    }



}
