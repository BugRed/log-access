package application;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

	private String userName;
	private Date entryDate;

	public LogEntry(String userName, Date entryDate) {
		this.userName = userName;
		this.entryDate = entryDate;
	}

	public String getName() {
		return userName;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public LogEntry(String userName) {
		super();
		this.userName = userName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(userName, other.userName);
	}

}
