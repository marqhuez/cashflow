create sequence HIBERNATE_SEQUENCE;

create table KATEGORIA
(
    KATEGORIAID INT auto_increment
        primary key,
    NEV         VARCHAR(40)
);

create table KIADAS
(
    ID         INT auto_increment
        primary key,
    OSSZEG     INT,
    MEGJEGYZES VARCHAR(50),
    KATEGORIA  INT
        references KATEGORIA (KATEGORIAID),
    DATUM      DATE default CURRENT_TIMESTAMP
);

create table BEVETEL
(
    ID           INT auto_increment
        primary key,
    OSSZEG       INT,
    MEGJEGYZES   VARCHAR(50),
    KATEGORIA    INT
        constraint UK_9AHG67CUS9H60L5JUWWYAU1P5
            unique,
    DATUM        DATE default CURRENT_TIMESTAMP,
    SZAMLA       INTEGER,
    IDOPONT      TIMESTAMP,
    KATEGORIA_ID INTEGER
);


