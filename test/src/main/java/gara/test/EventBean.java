package gara.test;

import java.util.Date;

public class EventBean {

	public  enum Status {DONE(1), UNDONE(2), CANCELED(3), SKIPPED(1);
		private int position; // price of each apple 

		  // Constructor 
		  Status(int p) {
			position = p;
		  }

		  int getPosition() {
		    return position;
		  }	
	};


	private Date eventDate;
	private Status eventStatus;
	private int id;
	private static int CURRENT_ID;


	public EventBean(Status status, Date date) {
		super();
		this.eventDate = date;
		this.eventStatus = status;
		this.id = CURRENT_ID;
		
		CURRENT_ID++;
	}
	
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public Status getEventStatus() {
		return eventStatus;
	}
	public void setEventStatus(Status eventStatus) {
		this.eventStatus = eventStatus;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "EventBean [eventDate=" + eventDate + "\t, eventStatus=" + eventStatus + "\t, id=" + id + "]";
	}

	

	

	
}
