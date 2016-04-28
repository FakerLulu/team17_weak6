package cnu.lecture;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by tchi on 2016. 4. 25..
 */
public class InGameInfo {
    public static class Observer {
        @Getter @Setter
        private String encryptionKey;

		String getEncryptionKey() {
			return encryptionKey;
		}
    }

    public static class Participant {
        @Getter @Setter
        private String summonerName;

		public String getSummonerName() {
			// TODO Auto-generated method stub
			return summonerName;
		}
    }

    @Getter @Setter
    private String platformId;

    @Getter @Setter
    private Observer observers;

    public Participant[] getParticipants() {
		return participants;
	}

	public void setParticipants(Participant[] participants) {
		this.participants = participants;
	}

	public Observer getObservers() {
		return observers;
	}

	public void setObservers(Observer observers) {
		this.observers = observers;
	}

	@Getter @Setter
    private Participant[] participants;

	
}
