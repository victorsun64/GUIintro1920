package guiintro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

public class Tr {

	protected Shell shell;
	private Text text;
	private Text OP;
	private Text wert;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Tr window = new Tr();
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
		shell.setSize(483, 286);
		shell.setText("SWT Application");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(10, 192, 105, 35);

		Button button0 = new Button(shell, SWT.NONE);
		button0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getText().getText()) * 10;
				getText().setText(Integer.toString(ergebnis));
			}
		});
		button0.setBounds(121, 192, 105, 35);
		button0.setText("0");

		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(232, 192, 105, 35);

		Button button1 = new Button(shell, SWT.NONE);
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getText().getText()) * 10 + 1;
				getText().setText(Integer.toString(ergebnis));
			}
		});
		button1.setBounds(10, 151, 105, 35);
		button1.setText("1");

		Button button2 = new Button(shell, SWT.NONE);
		button2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getText().getText()) * 10 + 2;
				getText().setText(Integer.toString(ergebnis));
			}
		});
		button2.setBounds(121, 151, 105, 35);
		button2.setText("2");

		Button button3 = new Button(shell, SWT.NONE);
		button3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getText().getText()) * 10 + 3;
				getText().setText(Integer.toString(ergebnis));
			}
		});
		button3.setBounds(232, 151, 105, 35);
		button3.setText("3");

		Button button4 = new Button(shell, SWT.NONE);
		button4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getText().getText()) * 10 + 4;
				getText().setText(Integer.toString(ergebnis));
			}
		});
		button4.setBounds(10, 110, 105, 35);
		button4.setText("4");

		Button button5 = new Button(shell, SWT.NONE);
		button5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getText().getText()) * 10 + 5;
				getText().setText(Integer.toString(ergebnis));
			}
		});
		button5.setBounds(121, 110, 105, 35);
		button5.setText("5");

		Button button6 = new Button(shell, SWT.NONE);
		button6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getText().getText()) * 10 + 6;
				getText().setText(Integer.toString(ergebnis));
			}
		});
		button6.setBounds(232, 110, 105, 35);
		button6.setText("6");

		Button button7 = new Button(shell, SWT.NONE);
		button7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getText().getText()) * 10 + 7;
				getText().setText(Integer.toString(ergebnis));
			}
		});
		button7.setBounds(10, 69, 105, 35);
		button7.setText("7");

		Button button8 = new Button(shell, SWT.NONE);
		button8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getText().getText()) * 10 + 8;
				getText().setText(Integer.toString(ergebnis));
			}
		});
		button8.setBounds(121, 69, 105, 35);
		button8.setText("8");

		Button button9 = new Button(shell, SWT.NONE);
		button9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getText().getText()) * 10 + 9;
				getText().setText(Integer.toString(ergebnis));
			}
		});
		button9.setBounds(232, 69, 105, 35);
		button9.setText("9");

		text = new Text(shell, SWT.BORDER);
		text.setText("0");
		text.setEditable(false);
		text.setBounds(10, 10, 327, 54);

		Button buttonPlus = new Button(shell, SWT.NONE);
		buttonPlus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getOP().setText(Integer.toString(0));
				int var = Integer.parseInt(getText().getText());
				getWert().setText(Integer.toString(var));
				getText().setText(Integer.toString(0));
			}
		});
		buttonPlus.setBounds(343, 149, 105, 35);
		buttonPlus.setText("+");

		Button buttonMinus = new Button(shell, SWT.NONE);
		buttonMinus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getOP().setText(Integer.toString(1));
				int var = Integer.parseInt(getText().getText());
				getWert().setText(Integer.toString(var));
				getText().setText(Integer.toString(0));
			}
		});
		buttonMinus.setBounds(343, 108, 105, 35);
		buttonMinus.setText("-");

		Button buttonMulti = new Button(shell, SWT.NONE);
		buttonMulti.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getOP().setText(Integer.toString(2));
				int var = Integer.parseInt(getText().getText());
				getWert().setText(Integer.toString(var));
				getText().setText(Integer.toString(0));
			}
		});
		buttonMulti.setBounds(343, 67, 105, 35);
		buttonMulti.setText("*");

		Button buttonDiv = new Button(shell, SWT.NONE);
		buttonDiv.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getOP().setText(Integer.toString(3));
				int var = Integer.parseInt(getText().getText());
				getWert().setText(Integer.toString(var));
				getText().setText(Integer.toString(0));
			}
		});
		buttonDiv.setBounds(343, 26, 105, 35);
		buttonDiv.setText("/");

		Button buttonEq = new Button(shell, SWT.NONE);
		buttonEq.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int OP = Integer.parseInt(getOP().getText());
				if (OP == 0) {
					int ergebnis = Integer.parseInt(getWert().getText()) + Integer.parseInt(getText().getText());
					getText().setText(Integer.toString(ergebnis));
				} else if (OP == 1) {
					int ergebnis = Integer.parseInt(getWert().getText()) - Integer.parseInt(getText().getText());
					getText().setText(Integer.toString(ergebnis));
				} else if (OP == 2) {
					int ergebnis = Integer.parseInt(getWert().getText()) * Integer.parseInt(getText().getText());
					getText().setText(Integer.toString(ergebnis));
				} else if (OP == 3) {
					int ergebnis = Integer.parseInt(getWert().getText()) / Integer.parseInt(getText().getText());
					getText().setText(Integer.toString(ergebnis));
				}
			}
		});
		buttonEq.setBounds(343, 192, 105, 35);
		buttonEq.setText("=");

		OP = new Text(shell, SWT.BORDER);
		OP.setEnabled(false);
		OP.setEditable(false);
		OP.setBounds(647, 458, 80, 31);
		
		wert = new Text(shell, SWT.BORDER);
		wert.setEnabled(false);
		wert.setEditable(false);
		wert.setBounds(549, 458, 80, 31);

	}

	public Text getText() {
		return text;
	}

	public Text getOP() {
		return OP;
	}
	public Text getWert() {
		return wert;
	}
}
