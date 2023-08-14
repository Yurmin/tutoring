# Progetto "Banca" esteso

Un semplice progetto per sperimentare e mettere in pratica le funzioni di Java

## Consegna originale

Utilizzando la scrittura/lettura su/da stream di oggetti, simulare la gestione di un
conto corrente bancario in cui il server fa da banca e l’utente può eseguire una delle
seguenti operazioni:

1. Deposito su conto corrente
2. Prelievo da conto corrente
3. Richiesta del saldo del conto corrente

## Extra

- Interfaccia o classe astratta "Operazione";
- Implementazione operazioni:
   - Deposito
   - Prelievo
   - Login
   - Logout
   - Invio denaro ad altro utente
- Classe centrale "Banca" da usare come server TCP con registro operazioni;
- Possibili operazioni;
- Diagramma UML (?);
- Client per esecuzione operazioni in TCP;
- Eccezioni dedicate.

## Esempio architettura applicazione

- ContoCorrente classe utente
- Banca classe server

## Operazione

1. Utente prova login ContoCorrente
2. Banca autentica Utente, restituisice ContoCorrente
3. Utente effettua operazione su ContoCorrente usando metodo, restituisce Operazione
4. Operazione inviata Banca che autentica e aggiunge a registro
