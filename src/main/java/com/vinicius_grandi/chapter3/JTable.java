package com.vinicius_grandi.chapter3;

import javax.accessibility.Accessible;
import javax.accessibility.AccessibleContext;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.TableUI;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.EventObject;

public abstract class JTable extends JComponent
        implements Accessible, CellEditorListener,
        ListSelectionListener, Scrollable,
        TableColumnModelListener, TableModelListener
{
    public static final int AUTO_RESIZE_ALL_COLUMNS = 0;
    public static final int AUTO_RESIZE_LAST_COLUMN = 0;
    public static final int AUTO_RESIZE_NEXT_COLUMN = 0;
    public static final int AUTO_RESIZE_OFF = 0;
    public static final int AUTO_RESIZE_SUBSEQUENT_COLUMN = 0;
    // constructors
    public abstract void JTable();
    public abstract void JTable(TableModel tm, TableColumnModel tcm);
    public abstract void JTable(TableModel tm, TableColumnModel tcm, ListSelectionModel lsm);
    public abstract void JTable(int a, int b);
    public abstract void JTable(Object[][] o, Object[][] oo);
    public abstract void JTable(java.util.Vector vector, java.util.Vector secondVector);
    // notification
    public abstract void addNotify();
    public abstract void columnAdded(TableColumnModelEvent event);
    public abstract void columnMarginChanged(ChangeEvent event);
    public abstract void columnMoved(TableColumnModelEvent event);
    public abstract void columnRemoved(TableColumnModelEvent event);
    public abstract void columnSelectionChanged(ListSelectionEvent event);
    public abstract void editingCanceled(ChangeEvent event);
    public abstract void editingStopped(ChangeEvent event);
    public abstract void tableChanged(TableModelEvent event);
    public abstract void valueChanged(ListSelectionEvent listSelectionEvent);
    // columns
    public abstract void addColumn(TableColumn column);
    public abstract void addColumnSelectionInterval(int start, int finish);
    public abstract void columnAtPoint(Point p);
    public abstract void convertColumnIndexToModel(int viewColumn);
    public abstract void convertColumnIndexToView(int modelColumn);
    public abstract boolean getAutoCreateColumnsFromModel();
    public abstract void createDefaultColumnsFromModel();
    public abstract TableColumn getColumn(Object object);
    public abstract Class getColumnClass(int column);
    public abstract int getColumnCount();
    public abstract TableColumnModel getColumnModel();
    public abstract String getColumnName(int column);
    public abstract Boolean getColumnSelectionAllowed();
    public abstract int getEditingColumn();
    public abstract int getSelectedColumn();
    public abstract int getSelectedColumnCount();
    public abstract int[] getSelectedColumns();
    public abstract Boolean isColumnSelected(int column);
    public abstract void moveColumn(int column, int newColumn);
    public abstract void removeColumn(TableColumn column);
    public abstract void removeColumnSelectionInterval(int column1, int column2);
    public abstract void setAutoCreateColumnsFromModel(Boolean doAutoCreate);
    public abstract void setColumnModel(TableColumnModel model);
    public abstract void setColumnSelectionAllowed(Boolean maySelect);
    public abstract void setColumnSelectionInterval(int column1, int column2);
    public abstract void setEditingColumn(int column);
    public abstract void sizeColumnsToFit(int resizingColumn);
    // rows
    public abstract void addRowSelectionInterval(int start, int finish);
    public abstract int getEditingRow();
    public abstract int getRowCount();
    public abstract int getRowHeight();
    public abstract int getRowMargin();
    public abstract Boolean getRowSelectionAllowed();
    public abstract int getSelectedRow();
    public abstract int getSelectedRowCount();
    public abstract int[] getSelectedRows();
    public abstract Boolean isRowSelected(int row);
    public abstract void removeRowSelectionInterval(int row1, int row2);
    public abstract int rowAtPoint(Point point);
    public abstract void setRowHeight(int height);
    public abstract void setRowMargin(int margin);
    public abstract void setRowSelectionAllowed(Boolean maySelect);
    public abstract void setEditingRow(int row);
    // Settings
    public abstract AccessibleContext getAccessibleContext();
    public abstract ListSelectionModel getSelectionModel();
    public abstract Component getEditorComponent();
    public abstract TableModel getModel();
    public abstract Component prepareEditor(TableCellEditor editor,
                                            int row, int column);
    public abstract Component prepareRenderer(TableCellRenderer renderer,
                                              int row, int column);
    public abstract void removeEditor();
    public abstract void setAutoResizeModel(int mode);
    public abstract void setCellEditor(TableCellEditor editor);
    public abstract void setCellSelectionEnabled(Boolean maySelect);
    public abstract void setDefaultEditor(Class c, TableCellEditor editor);
    public abstract int getAutoResizeMode();
    public abstract TableCellEditor getCellEditor();
    public abstract TableCellEditor getCellEditor(int row, int column);
    public abstract TableCellEditor getDefaultEditor(Class c);
    public abstract TableCellRenderer getDefaultRenderer(Class c);
    public abstract Dimension getPreferredScrollableViewportSize();


    // Values
    public abstract Rectangle getCellRect(int row, int column,
                                          boolean includeSpacing);
    public abstract void clearSelection();
    public abstract boolean editCellAt(int row, int column);
    public abstract boolean editCellAt(int row, int column, EventObject event);
    public abstract Object getValueAt(int row, int column);
    public abstract Boolean isCellSelected(int row, int column);
    public abstract Boolean isCellEditable(int row, int column);
    public abstract Boolean isEditing();
    public abstract void setValueAt(Object value, int row, int column);
    public abstract void selectAll();
    public abstract boolean getCellSelectionEnabled();
    public abstract boolean isManagingFocus();

    // UI
    public abstract int getScrollableBlockIncrement(
            Rectangle visible, int orientation, int direction);
    public abstract boolean getScrollableTracksViewportHeight();
    public abstract boolean getScrollableTracksViewportWidth();
    public abstract int getScrollableUnitIncrement(
            Rectangle visible, int orientation, int direction);
    public abstract Boolean getShowHorizontalLines();
    public abstract Boolean getShowVerticalLines();
    public abstract JTableHeader getTableHeader();
    public abstract Color getGridColor();
    public abstract Dimension getIntercellSpacing();
    public abstract Color getSelectionBackground();
    public abstract Color getSelectionForeground();
    public abstract String getToolTipText(MouseEvent event);
    public abstract void reshape(int x, int y, int width, int height);
    public abstract void setDefaultRenderer(Class c, TableCellRenderer renderer);
    public abstract void setGridColor(Color color);
    public abstract void setIntercellSpacing(Dimension dim);
    public abstract void setModel(TableModel model);
    public abstract TableUI getUI();
    public abstract String getUIClassID();
    public abstract void setPreferredScrollableViewportSize(Dimension dim);
    public abstract void setSelectionBackground(Color background);
    public abstract void setSelectionForeground(Color foreground);
    public abstract void setSelectionMode(int mode);
    public abstract void setSelectionModel(ListSelectionModel model);
    public abstract void setShowGrid(Boolean showing);
    public abstract void setShowHorizontalLines(Boolean b);
    public abstract void setShowVerticalLines(Boolean b);
    public abstract void setTableHeader(JTableHeader header);
    public abstract void setUI(TableUI ui);
    public abstract void updateUI();
}
