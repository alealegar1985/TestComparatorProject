package gara.test;

import java.util.Comparator;
import java.util.Date;

import gara.test.EventBean;
import gara.test.EventBean.Status;

@SuppressWarnings("hiding")
public class DateTimeStatusComparator implements Comparator<EventBean> {

	public int compare(EventBean el1, EventBean el2) {
		//STATUS
		if (el1.getEventStatus().getPosition() > el2.getEventStatus().getPosition())
			 return 1;
		else if (el1.getEventStatus().getPosition() == el2.getEventStatus().getPosition())
			 return compareByDate(el1.getEventDate(), el2.getEventDate());
		else 
			return -1;
		
	
	}
	private int compareByDate(Date d1, Date d2) {
		if(d1.after(d2))
			return 1;
		else if(d1.before(d2))
			return -1;
		else 
			return 0;
		
	}

}
