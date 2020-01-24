# GARAGE
Si realizzi una applicazione java per la gestione 
di un garage secondo le specifiche:<br>
Il `Garage` ha al max 15 posti ognuno dei quali è identificato da un 
num a partire da 0 e, per motivi di capienza, può ospitare solo auto moto e furgoni partendo 
dalla classe base `Veicolo` a motore V. La si estenda, realizzando anche 
le classi che modellano le entità `Furgone` [F], `Auto` [A] e `Moto` [M].<br>
Ridefinire il metodo `toString()` in modo che ogni entità possa esternalizzare 
in forma di stringa tutte le informazioni che la riguardano.<br>
Si implementi una classe che modelli il garage sopradescritto offrendo 
le seguenti operazioni di gestione:
1. Immissione di un nuovo veicolo;
1. Estrazione dal garage del veicolo che occupa un determinato posto (ritornare l'istanza del veicolo stesso);
1. Stampa della situazione corrente dei posti nel garage veicolo: *marca*, *anno*, *cilindrata*,
    - **auto**: porte, alimentazione [Diesel | Benzina];
    - **moto**: tempi;
    - **furgone**: capacità.