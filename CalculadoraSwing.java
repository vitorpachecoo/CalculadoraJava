import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CalculadoraSwing extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Criando os componentes da calculadora
        Label labelNumero1 = new Label("Número 1:");
        TextField campoNumero1 = new TextField();

        Label labelNumero2 = new Label("Número 2:");
        TextField campoNumero2 = new TextField();

        Label resultadoLabel = new Label("Resultado: ");

        Button btnAdicao = new Button("+");
        Button btnSubtracao = new Button("-");
        Button btnMultiplicacao = new Button("*");
        Button btnDivisao = new Button("/");

        // Layout para os botões
        HBox botoes = new HBox(10, btnAdicao, btnSubtracao, btnMultiplicacao, btnDivisao);
        botoes.setStyle("-fx-alignment: center;");

        // Layout principal
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");
        root.getChildren().addAll(labelNumero1, campoNumero1, labelNumero2, campoNumero2, botoes, resultadoLabel);

        // Adicionando o menu
        MenuBar menuBar = new MenuBar();

        // Menu "Arquivo"
        Menu menuArquivo = new Menu("Arquivo");
        MenuItem itemNovo = new MenuItem("Novo");
        MenuItem itemSair = new MenuItem("Sair");
        menuArquivo.getItems().addAll(itemNovo, new SeparatorMenuItem(), itemSair);

        // Menu "Ajuda"
        Menu menuAjuda = new Menu("Ajuda");
        MenuItem itemSobre = new MenuItem("Sobre");
        menuAjuda.getItems().add(itemSobre);

        // Adicionando menus à barra de menu
        menuBar.getMenus().addAll(menuArquivo, menuAjuda);

        // Adicionando eventos ao menu
        itemNovo.setOnAction(e -> {
            campoNumero1.clear();
            campoNumero2.clear();
            resultadoLabel.setText("Resultado:");
        });

        itemSair.setOnAction(e -> {
            primaryStage.close();
        });

        itemSobre.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sobre");
            alert.setHeaderText("Calculadora JavaFX");
            alert.setContentText("Esta é uma calculadora simples criada em JavaFX.");
            alert.showAndWait();
        });

        // Adicionando a barra de menu no topo
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setCenter(root);

        // Criando e configurando a cenaa
        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setTitle("Calculadora com Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
