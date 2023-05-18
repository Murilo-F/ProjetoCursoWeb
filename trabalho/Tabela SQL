Tabela SQL


-- Criação da tabela Fornecedor
CREATE TABLE Fornecedor (
  fornecedorId INT PRIMARY KEY,
  nome VARCHAR(255) NOT NULL,
  endereco VARCHAR(255) NOT NULL,
  telefone VARCHAR(20) NOT NULL,
  CNPJ VARCHAR(14) NOT NULL,
  tempo_entrega VARCHAR(50) NOT NULL,
  email VARCHAR(255) NOT NULL
);

-- Criação da tabela Material
CREATE TABLE Material (
  materialId INT PRIMARY KEY,
  nome VARCHAR(255) NOT NULL,
  codigo_barras VARCHAR(255) NOT NULL,
  valor_compra DECIMAL(10, 2) NOT NULL,
  fornecedorId INT,
  quantidade_minima INT NOT NULL,
  fabricante VARCHAR(255) NOT NULL,
  descricao VARCHAR(255) NOT NULL,
  FOREIGN KEY (fornecedorId) REFERENCES Fornecedor (fornecedorId)
);

-- Criação da tabela Almoxarifado
CREATE TABLE Almoxarifado (
  almoxarifadoId INT PRIMARY KEY,
  materialId INT,
  quantidade INT NOT NULL,
  data_entrada DATE,
  data_saida DATE,
  FOREIGN KEY (materialId) REFERENCES Material (materialId)
);

-- Criação da tabela Relatorios
CREATE TABLE Relatorios (
  relatorioId INT PRIMARY KEY,
  vendaId INT,
  materialId INT,
  vendas_realizadas INT NOT NULL,
  materiais_baixo_estoque INT NOT NULL,
  materiais_em_falta INT NOT NULL,
  FOREIGN KEY (vendaId) REFERENCES Venda (vendaId),
  FOREIGN KEY (materialId) REFERENCES Material (materialId)
);

-- Criação da tabela Funcionario
CREATE TABLE Funcionario (
  funcionarioId INT PRIMARY KEY,
  matricula INT NOT NULL,
  nome VARCHAR(255) NOT NULL,
  endereco VARCHAR(255) NOT NULL,
  telefone VARCHAR(20) NOT NULL,
  CPF VARCHAR(11) NOT NULL,
  data_nascimento DATE NOT NULL,
  situacao VARCHAR(20) NOT NULL,
  email VARCHAR(255) NOT NULL,
  cargo VARCHAR(255) NOT NULL,
  login VARCHAR(50) NOT NULL,
  senha VARCHAR(50) NOT NULL
);

-- Criação da tabela Venda
CREATE TABLE Venda (
  vendaId INT PRIMARY KEY,
  funcionarioId INT,
  produto_solicitado VARCHAR(255) NOT NULL,
  data_demanda DATE NOT NULL,
  valor_total DECIMAL(10, 2) NOT NULL,
  forma_pagamento VARCHAR(50) NOT NULL,
  situacao VARCHAR(20) NOT NULL,
  FOREIGN KEY (funcionarioId) REFERENCES Funcionario (funcionarioId)
);
