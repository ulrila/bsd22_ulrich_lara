# exercise2

## git config
- zum einrichten von Git-Konfigurationswerten auf globaler oder lokaler Projektebene
- z.B. haben wir am Anfang auch unseren Username und unsere Email festgelegt mit 
    - git config --global user.name
    - git config --global user.email

---

## git init
- damit kann man eine Git Repository lokal initialisieren
- kann in dem Verzeichnis mit arbeiten
- der darausfolgende Order wird Arbeitsverzeichnis (working directory) genannt
---


## git status
- damit ruf man den aktuellen Status des Git Repositorys auf
- es werden alle neuen und geaenderten Dateien uebersichltich dargestellt
- Dateien die in einem .gitignore sind werden nicht angezeigt z.B.
---

## git add
- git add filename
- damit wird die Datei nach hinzufuegen oder veraendern zum Git Staging Bereich des Repository hizugefuegt
- danach folgt typischerweise git commit
---

## git commit
- git commit -m ""
    - folgt nach git add 
    - damit kommt die Datei vom Staging Bereich in das Git Repository als eine neue Version
    - in die "" kann man einen Kommentar hinzufuegen - z.B. was man geaendert hat


- git commit --help
    - damit erhaelt man Hilfe
---

## git log
- damit kann man Informationen des letzten Commits erhalten
- oder auch die Beziehung zu vorherigen Commits darstellen
    - git log --graph

---
## git diff
- damit kann man Git-Datenquellen vergleichen
- koennen Commits, Branches, Dateien usw sein
- oft mit status und log zusammen verwendet um den Status eines Git Repositorys zu analysieren

---

## git pull
- damit wird die aktuelle Version des Repositories vom Server geholt und die Dateien aktualisiert 
- "herziehen" "holen"

---

## git push
- damit kann die Dateien des lokalen Repositories an den Server schicken 
- "hinschieben" "raufschieben"

---

