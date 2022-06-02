package jogo.aimtrainer;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class PainelAlvos extends GridPane{

	public PainelAlvos() {

		Caixa c1 = new Caixa();
		Caixa c2 = new Caixa();
		Caixa c3 = new Caixa();
		Caixa c4 = new Caixa();
		Caixa c5 = new Caixa();
		Caixa c6 = new Caixa();
		
		remover(c1);
		remover(c2);
		remover(c3);
		remover(c4);
		remover(c5);
		remover(c6);
		
		getColumnConstraints().addAll(cc(), cc(), cc(), cc(), cc());
		getRowConstraints().addAll(rc(), rc(), rc(), rc(), rc());
		
		
		add(c1, (int) (Math.random() * 5), (int) (Math.random() * 5));
		add(c2, (int) (Math.random() * 5), (int) (Math.random() * 5));
		add(c3, (int) (Math.random() * 5), (int) (Math.random() * 5));
		add(c4, (int) (Math.random() * 5), (int) (Math.random() * 5));
		add(c5, (int) (Math.random() * 5), (int) (Math.random() * 5));
		add(c6, (int) (Math.random() * 5), (int) (Math.random() * 5));
		
		
		
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
	
	private void remover(Caixa caixa) {
		caixa.setOnMouseClicked(e -> {
			getChildren().remove(caixa);
		});
	}
	
}
