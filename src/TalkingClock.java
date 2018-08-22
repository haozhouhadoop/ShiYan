import java.awt.Desktop.Action;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;


public class TalkingClock {
	private int interval;
	private boolean beep;
	

	public TalkingClock(int i, boolean b) {
		
		this.interval=i;
		this.beep=b;
		
	}

	public void start() {
		ActionListener listener=new TimePrinter();
		Timer t=new Timer(interval,listener);//初始化监听器
		t.start();         //开始计时
		
		
	}
	public class TimePrinter implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Date now=new Date();
			System.out.println("At the tone,the time is"+now);
			if(beep)Toolkit.getDefaultToolkit().beep();
			
		}
	}

}

