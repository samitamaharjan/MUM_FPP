import javax.swing.*;

import java.awt.event.*;
import java.sql.*;
import java.awt.*;

class Myframe extends JFrame implements ActionListener {
	// Demo Code using MS-Access
	JLabel lNumber, lName;
	JTextField tNumber, tName;
	JButton bInsert, bUpdate, bSearch, bNext, bPrevious, bLast, bFirst, bClear,
			bDelete, bExit;

	Connection cn;
	Statement st;
	ResultSet rs;
	Container conpane;

	boolean isDBOpen = false;
	boolean isResultSetOpen = false;

	Myframe() {
		lNumber = new JLabel("Employee Number");
		lName = new JLabel("Employee Name");

		tNumber = new JTextField(6);
		tName = new JTextField(15);

		bInsert = new JButton("Insert");
		bNext = new JButton("Next");
		bPrevious = new JButton("Previous");
		bLast = new JButton("Last");
		bFirst = new JButton("First");
		bClear = new JButton("Clear");
		bDelete = new JButton("Delete");
		bUpdate = new JButton("Update");
		bSearch = new JButton("Search");
		bExit = new JButton("Exit");

		conpane = getContentPane();

		JPanel txtPanel, btnPanel;

		txtPanel = new JPanel();
		btnPanel = new JPanel();

		conpane.add(txtPanel, BorderLayout.NORTH);
		conpane.add(btnPanel, BorderLayout.CENTER);

		txtPanel.add(lNumber);
		txtPanel.add(tNumber);

		txtPanel.add(lName);
		txtPanel.add(tName);

		btnPanel.add(bNext);
		btnPanel.add(bPrevious);
		btnPanel.add(bLast);
		btnPanel.add(bFirst);
		btnPanel.add(bInsert);
		btnPanel.add(bDelete);
		btnPanel.add(bSearch);
		btnPanel.add(bUpdate);
		btnPanel.add(bClear);
		btnPanel.add(bExit);

		bInsert.addActionListener(this);
		bNext.addActionListener(this);
		bPrevious.addActionListener(this);
		bLast.addActionListener(this);
		bFirst.addActionListener(this);
		bClear.addActionListener(this);
		bDelete.addActionListener(this);
		bUpdate.addActionListener(this);
		bSearch.addActionListener(this);
		bExit.addActionListener(this);

		dbOpen();
	}

	public void actionPerformed(ActionEvent a) {

		try {

			if (a.getSource() == bSearch) {

				if (!isDBOpen)
					dbOpen();

				String str = JOptionPane.showInputDialog(null,
						"Enter number : ");
				int ueno = Integer.parseInt(str);
				rs = st.executeQuery("select * from employee where eno=" + ueno);
				;

				if (!rs.next())
					JOptionPane.showMessageDialog(null, "Record not found");
				else {
					setText();
					dbClose();
				}
			}

			if (a.getSource() == bUpdate) {

				if (!isDBOpen)
					dbOpen();

				int ueno = Integer.parseInt(tNumber.getText());

				rs = st.executeQuery("select * from employee where eno=" + ueno);// +
																					// "");

				if (!rs.next())
					JOptionPane.showMessageDialog(null, "Record not found");
				else {
					st.executeUpdate("UPDATE employee SET eno=" + ueno
							+ ",ename='" + tName.getText() + "' WHERE eno="
							+ ueno + "  ");
					JOptionPane.showMessageDialog(null, "Record is updated");

					isResultSetOpen = false;
					dbClose();

				}

			}

			if (a.getSource() == bDelete) {
				if (!isDBOpen)
					dbOpen();

				int deno = Integer.parseInt(tNumber.getText());

				st.executeUpdate("DELETE FROM employee WHERE eno=" + deno);
				JOptionPane.showMessageDialog(null, "Record is deleted");

				isResultSetOpen = false;
				dbClose();

			}

			if (a.getSource() == bClear) {
				tNumber.setText("");
				tName.setText("");
			}

			if (a.getSource() == bFirst) {
				if (!isDBOpen)
					dbOpen();

				rs.first();
				setText();
			}

			if (a.getSource() == bLast) {
				if (!isDBOpen)
					dbOpen();
				rs.last();
				setText();

			}

			if (a.getSource() == bNext) {
				if (!rs.isLast()) { /* isAfterLast() */
					rs.next();
					setText();
				} else {
					JOptionPane.showMessageDialog(null, "Last Record");
					rs.last();
				}

			}

			if (a.getSource() == bPrevious) {
				if (!rs.isFirst()) { /* isBeforeFirst() */
					rs.previous();
					setText();
				} else {
					JOptionPane.showMessageDialog(null, "First Record");
					rs.first();
				}

			}
			if (a.getSource() == bInsert) {

				if (!isDBOpen)
					dbOpen();

				int eno = Integer.parseInt(tNumber.getText());
				String name = (tName.getText());
				st.executeUpdate("insert into employee values('" + (eno)
						+ "','" + (name) + "','" + 1001 + "')");
				JOptionPane.showMessageDialog(null,
						"Record inserted into database");
				isResultSetOpen = false;
				dbClose();

			}
			if (a.getSource() == bExit) {
				if (JOptionPane.showConfirmDialog(null,
						"Are You Sure You Want to Exit?", "Confirm",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void dbOpen() {
		try {

			// Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// cn = DriverManager.getConnection("jdbc:odbc:renuka");
			cn = DriverManager
					.getConnection("jdbc:ucanaccess://C:/Users/admin1/Desktop/FPP-Aug-2015/emp_DB.accdb");

			st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			rs = st.executeQuery("select * from employee order by 1");
			rs.next();

			isDBOpen = true;
			isResultSetOpen = true;

		} catch (Exception e) {
		}
	}

	public void setText() {
		try {
			tNumber.setText(rs.getString(1));
			tName.setText(rs.getString(2));
		} catch (Exception ex) {
		}
	}

	public void dbClose() {
		try {
			isDBOpen = false;
			if (isResultSetOpen)
				rs.close();
			st.close();
			cn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

public class jdbcdemoframe {

	public static void main(String[] args) {
		Myframe f = new Myframe();
		f.setVisible(true);
		f.setTitle("Number and Name");
		f.setSize(400, 150);

	}

}
