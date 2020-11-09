# Software Engineering im Studiengang Media Engineering

## Assignment "Game Of Life"  

### Einführung

#### Game of Life

Ihre Aufgabe ist es, eine Klasse <code>Life</code> zu implementieren,
die das *Game of Life* simuliert. Beim *Game of Life* 
werden Zellen in einem zweidimensionelen Raster angeordnet. 
An jedem Rasterpunkt kann entweder eine lebende Zelle oder ein
Leerraum positioniert werden.

Für das Entstehen, Überleben oder Absterben einer Zelle
ist die Anzahl der unmittelbaren Nachbarn entscheidend.
Jeder Rasterpunkt hat 8 benachbarte Rasterpunkte 
(links, rechts, oben, unten, oben links, oben rechts, unten links, unten rechts).
Für die Berechnung der nachfolgenden Generation sind auf die
aktuelle Generation folgende Regeln anzuwenden:

- Eine neue Zelle an einem bisher belebten Rasterpunkt entsteht,
  wenn genau drei benachbarte Rasterpunkte mit lebenden Zellen 
  besetzt sind.

- Lebende Zellen mit weniger als zwei lebenden Nachbarn sterben in der Folgegeneration an Einsamkeit.

- Eine lebende Zelle mit zwei oder drei lebenden Nachbarn bleibt in der Folgegeneration am Leben.

- Lebende Zellen mit mehr als drei lebenden Nachbarn sterben in der Folgegeneration an Überbevölkerung.


#### Vorgaben

Im Assignment werden Ihnen drei Code-Dateien vorgegeben:

- <code>Life</code> soll später den Produktivcode enthalten.
- <code>LifeTest</code> soll für den Testcode benutzt werden.
- <code>ILife</code> ist ein Interface, das von der <code>Life</code>-Klasse
  implementiert werden soll.

### Aufgabenstellung

Implementieren Sie die Klasse <code>Life</code> unter Nutzung der TDD-Vorgehensweise.
Erstellen Sie für die oben genannten Regeln jeweils mindestens einen Testfall (für
die erste Regel wurde bereits ein Testfall mitgeliefert).


