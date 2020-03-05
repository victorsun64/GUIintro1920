package guiintro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Taschenrechner {

	protected Shell shell;
	private Text text;
	private Text Ergebnis;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Taschenrechner window = new Taschenrechner();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(10, 203, 80, 31);
		
		Ergebnis = new Text(shell, SWT.BORDER);
		Ergebnis.setText("0");
		Ergebnis.setEditable(false);
		Ergebnis.setBounds(338, 203, 80, 31);
		
		Button Addbtn = new Button(shell, SWT.NONE);
		Addbtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText());
				int wert = Integer.parseInt(getText().getText());
				//
				ergebnis = ergebnis + wert;
				//
				getErgebnis().setText(Integer.toString(ergebnis));
				getText().setText("");
			}
		});
		Addbtn.setBounds(10, 100, 105, 35);
		Addbtn.setText("+");
		
		Button Minusbtn = new Button(shell, SWT.NONE);
		Minusbtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText());
				int wert = Integer.parseInt(getText().getText());
				//
				ergebnis = ergebnis - wert;
				//
				getErgebnis().setText(Integer.toString(ergebnis));
				getText().setText("");
			}
		});
		Minusbtn.setBounds(10, 10, 105, 35);
		Minusbtn.setText("-");
		
		Button Multibtn = new Button(shell, SWT.NONE);
		Multibtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText());
				int wert = Integer.parseInt(getText().getText());
				//
				ergebnis = ergebnis * wert;
				//
				getErgebnis().setText(Integer.toString(ergebnis));
				getText().setText("");
			}
		});
		Multibtn.setBounds(313, 10, 105, 35);
		Multibtn.setText("*");
		
		Button Dividebtn = new Button(shell, SWT.NONE);
		Dividebtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText());
				int wert = Integer.parseInt(getText().getText());
				//
				ergebnis = ergebnis / wert;
				//
				getErgebnis().setText(Integer.toString(ergebnis));
				getText().setText("");
			}
		});
		Dividebtn.setBounds(313, 100, 105, 35);
		Dividebtn.setText("/");

	}
	public Text getText() {
		return text;
	}
	public Text getErgebnis() {
		return Ergebnis;
	}
}
