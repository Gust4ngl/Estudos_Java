package jogo.aimtrainer;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class PainelAlvos extends GridPane{

	public PainelAlvos() {

		getColumnConstraints().addAll(cc(), cc(), cc(), cc(), cc());
		getRowConstraints().addAll(rc(), rc(), rc(), rc(), rc());
		
		Caixa c1 = new Caixa();
		Caixa c2 = new Caixa();
		
		adicionar(c1);
		remover(c1);
		
	}
	
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
			cc.setPercentWidth(20);
			cc.setFillWidth(true);
		return cc;
	}
	
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
			rc.setPercentHeight(20);
			rc.setFillHeight(true);
		return rc;
	}
	
	private void remover(Caixa c1) {
		c1.setOnMouseClicked(e -> {
			getChildren().remove(c1);
			adicionar(c1);
		});
	}
	
	private void adicionar(Caixa caixa) {
		add(caixa, (int) (Math.random() * 5), (int) (Math.random() * 5));
	}
	
	
}
