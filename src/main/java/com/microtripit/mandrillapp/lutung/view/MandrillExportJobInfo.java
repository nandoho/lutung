/**
 * 
 */
package com.microtripit.mandrillapp.lutung.view;

import java.util.Date;

import com.google.api.client.util.Key;

/**
 * @author rschreijer
 *
 */
public class MandrillExportJobInfo {
	@Key
	private String id;
	@Key
	private String type;
	@Key
	private String state;
	@Key
	private String result_url;
	@Key
	private Date created_at;
	@Key
	private Date finished_at;
	
	/**
	 * @return The unique identifier for this Export. Use 
	 * this identifier when checking the export job's status.
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return The type of the export job: 
	 * 'activity', 'reject', or 'whitelist'.
	 */
	public String getType() {
		return type;
	}
	/**
	 * @return The export job's state: 'waiting', 
	 * 'working', 'complete', 'error', or 'expired'.
	 */
	public String getState() {
		return state;
	}
	/**
	 * @return The url for the export job's results, 
	 * if the job is complete.
	 */
	public String getResultUrl() {
		return result_url;
	}
	/**
	 * @return The date and time that the export job was created.
	 */
	public Date getCreatedAt() {
		return created_at;
	}
	/**
	 * @return The date and time that the export job was finished.
	 */
	public Date getFinishedAt() {
		return finished_at;
	}

	
	
}
