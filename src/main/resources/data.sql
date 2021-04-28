DROP TABLE IF EXISTS dna;

CREATE TABLE dna (
  id_dna INT AUTO_INCREMENT  PRIMARY KEY,
  sequence VARCHAR(250) NOT NULL,
  has_mutation BOOLEAN
);

INSERT INTO dna (id_dna, sequence, has_mutation) VALUES
  ('1', '"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA","TCACTG"', true),
  ('2', '"ATGCGA", "CAGTGC", "ATATGT", "AGAAGG", "ACCATA","ACACTG"', true),
  ('3', '"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCBTA","TCACTG"', false);