package sudoku;

import android.app.Activity;

public class MainActivity extends Activity{
	@Override
	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(new SudokuView(this)); // Set the view of the activity as MyView
	}
}
