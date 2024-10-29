package airport;

import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.*;
import java.time.temporal.TemporalAmount;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static long findCountAircraftWithModelAirbus(Airport airport, String model) {
        //TODO Метод должен вернуть количество самолетов указанной модели.
        // подходят те самолеты, у которых name начинается со строки model
        return airport.getAllAircrafts().stream()
                .filter(aircraft -> aircraft.getModel().startsWith(model))
                .count();
    }

    public static Map<String, Integer> findMapCountParkedAircraftByTerminalName(Airport airport) {
        //TODO Метод должен вернуть словарь с количеством припаркованных самолетов в каждом терминале.
        return airport.getTerminals().stream()
                .collect(Collectors.toMap(Terminal::getName, terminal -> terminal.getParkedAircrafts().size()));
    }

    public static List<Flight> findFlightsLeavingInTheNextHours(Airport airport, int hours) {
        //TODO Метод должен вернуть список отправляющихся рейсов в ближайшее количество часов.
        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream()
                        .filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE))
                        .filter(flight -> flight.getDate()
                                .isBefore(Instant.from(Instant.now().plusSeconds(hours * 3600))))
                        .filter(flight -> flight.getDate().isAfter(Instant.now()))
                )
                .collect(Collectors.toList());
    }

    public static Optional<Flight> findFirstFlightArriveToTerminal(Airport airport, String terminalName) {
        //TODO Найти ближайший прилет в указанный терминал.
        Optional<Terminal> terminal = airport.getTerminals().stream().filter(term -> term.getName().equals(terminalName)).findFirst();
        if (terminal.isPresent()) {
            return terminal.get().getFlights().stream()
                    .filter(flight -> flight.getType().equals(Flight.Type.ARRIVAL))
                    .min(Comparator.comparing(Flight::getDate));
        }
        return Optional.empty();
    }
}