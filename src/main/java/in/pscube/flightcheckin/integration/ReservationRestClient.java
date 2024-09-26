package in.pscube.flightcheckin.integration;

import in.pscube.flightcheckin.integration.dto.Reservation;
import in.pscube.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);
}
