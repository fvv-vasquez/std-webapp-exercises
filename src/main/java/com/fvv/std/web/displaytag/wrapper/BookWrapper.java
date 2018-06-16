package com.fvv.std.web.displaytag.wrapper;

import java.text.DecimalFormat;

import org.apache.commons.lang.time.FastDateFormat;
import org.displaytag.decorator.TableDecorator;

import com.fvv.std.bean.Book;
import com.fvv.std.util.DateUtil;

public class BookWrapper extends TableDecorator {

	/**
     * FastDateFormat used to format dates in getDate().
     */
    private FastDateFormat dateFormat;
    
    /**
     * DecimalFormat used to format money in getMoney().
     */
    private DecimalFormat moneyFormat;
    
    /**
     * Creates a new Wrapper decorator who's job is to reformat some of the data located in our TestObject's.
     */
    public BookWrapper() {
        super();
        this.dateFormat = FastDateFormat.getInstance("MM/dd/yy"); 
        this.moneyFormat = new DecimalFormat("R$ #,###,###.00");
    }
    
    /**
     * Test method which always returns a null value.
     * @return <code>null</code>
     */
    public String getNullValue() {
        return null;
    }

    /**
     * Returns the date as a String in dd/MM/yy format.
     * @return formatted date
     */
    public String getPublicationDate() {
    	return this.dateFormat.format(DateUtil.convertLocalDateToDate(((Book) this.getCurrentRowObject()).getPublicationDate()));
    }
    
    /**
     * Returns the money as a String in R$ #.###.###,00 format.
     * @return String
     */
    public String getMoney()
    {
        return this.moneyFormat.format(((Book) this.getCurrentRowObject()).getUnitPrice());
    }
}
