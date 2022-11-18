package soleraPairProgrammingPractice.Katas.Bingo;

import java.util.List;

public class Card {
	
	private List<List<String>> columns;

    public Card(List<List<String>> columns) {
        this.columns = columns;
    }

    public List<String> getColumn(Column column) {
        return columns.get(column.index);
    }

    public enum Column {
        B(0), I(1), N(2), G(3), O(4);

        public final int index;

        Column(int index) {
            this.index = index;
        }
    }

}
