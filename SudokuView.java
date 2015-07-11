package sudoku;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

public class SudokuView {
	private float width;
	private float height;
	public SudokuView (Context context){
		super(context);
	}
	
	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh){
		this.width=w/9;
		this.height=h/9;
		super.onSizeChanged(w,h,oldw,oldh);
	}
	
	@Override
	protected void onDraw(Canvas canvas){
		Paint.backgroundPaint=new Paint();
		backgroundPaint.setColor(getResources().getColor(R.color.sudoku_background));
		canvas.drawRect(0,0,getWidth(),getHeight(),backgroundPaint);
		
		Paint darkPaint=new Paint();
		darkPaint.setColor(getResources().getColor(R.color.sudoku_dark));
		
		Paint highLightPaint = new Paint();
		highLightPaint.setColor(getResources().getColor(R.color.highLight));
		
		Paint lightPaint = new Paint();
		lightPaint.setColor(getResources().getColor(R.color.sudoku_light);
		
		for (int i=0; i<9; i++){ 
			/* 2 lines each for horizontal and vertical: 
			 * a lighter one and a darker one for a special effect*/
			 
			/* Draw horizontal lines */
			canvas.drawLine(0,i*height,getWidth(),i*height, lightPaint);
			canvas.drawLine(0,i*height+1,getWidth(),i*height+1,highLightPaint);
			/* Draw vertical lines */
			canvas.drawLine(i*width,0,i*width,getHeight(), lightPaint);
			canvas.drawLine(i*width+1,0,i*width,getHeight(),highLightPaint);
		}
		
		for (int i=0;i<9;i++){
			/* For every 3 horizontal and vertical lines, there's a bold one */
			if(i%3!=0){
				continue;
			}
			canvas.drawLine(0,i*height,getWidth(),i*height, darkPaint);
			canvas.drawLine(0,i*height+1,getWidth(),i*height+1,highLightPaint);
			
			canvas.drawLine(i*width,0,i*width,getHeight(), darkPaint);
			canvas.drawLine(i*width+1,0,i*width,getHeight(),highLightPaint);
		}
		
		// Paint object For numbers
		Paint numberPaint = new Paint;
		numberPaint.setColor(Color.BLACK);
		numberPaint.setStyle(Paint.Style.STROKE);
		numberPaint.setTextStylr(height*0.75);
		numberPaint.setTexAlign(Paint.Align.CENtER);
		
		float x=width/2;
		canvas.drawText("1",3*width+x,61,numberPaint);
		super onDraw(canvas);
	}
}
