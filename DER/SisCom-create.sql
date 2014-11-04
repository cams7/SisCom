-- ------------------------------------------------------------
-- Plano de Conta
-- Obs.: Toda vez que for cadastrar uma despesa, a depesa estara vinculada ao codigo do plano conta
-- ------------------------------------------------------------

CREATE TABLE plano_conta (
  cod_plano_conta SERIAL NOT NULL,
  descricao_plano_conta VARCHAR(20) NOT NULL,
  PRIMARY KEY(cod_plano_conta)
);

-- ------------------------------------------------------------
-- Cabecario de Cotacao
-- ------------------------------------------------------------

CREATE TABLE cot_cab (
  cod_cot_cab SERIAL NOT NULL,
  data_cot_cab DATE NULL,
  forn1 INTEGER NULL,
  forn2 INTEGER NULL,
  forn3 INTEGER NULL,
  forn4 INTEGER NULL,
  forn5 INTEGER NULL,
  condicoes1 VARCHAR(30) NULL,
  condicoes2 VARCHAR(30) NULL,
  condicoes3 VARCHAR(30) NULL,
  condicoes4 VARCHAR(30) NULL,
  condicoes5 VARCHAR(30) NULL,
  desconto1 FLOAT8 NULL,
  desconto2 FLOAT8 NULL,
  desconto3 FLOAT8 NULL,
  desconto4 FLOAT8 NULL,
  desconto5 FLOAT8 NULL,
  entrega1 VARCHAR(30) NULL,
  entrega2 VARCHAR(30) NULL,
  entrega3 VARCHAR(30) NULL,
  entrega4 VARCHAR(30) NULL,
  entrega5 VARCHAR(30) NULL,
  total1 FLOAT8 NULL,
  total2 FLOAT8 NULL,
  total3 FLOAT8 NULL,
  total4 FLOAT8 NULL,
  total5 FLOAT8 NULL,
  PRIMARY KEY(cod_cot_cab)
);

CREATE TABLE conciliacao (
  cod_conciliacao SERIAL NOT NULL,
  num_cheque_conciliacao INTEGER NULL,
  data_cheque_conciliacao DATE NULL,
  vlr_cheque_conciliacao FLOAT8 NULL,
  mes_ano_conciliacao VARCHAR(7) NULL,
  historico_conciliacao VARCHAR(50) NULL,
  PRIMARY KEY(cod_conciliacao)
);

-- ------------------------------------------------------------
-- Fornecedor
-- ------------------------------------------------------------

CREATE TABLE fornecedor (
  cod_fornecedor SERIAL NOT NULL,
  nome_fornecedor VARCHAR(50) NOT NULL,
  cpf_fornecedor VARCHAR(11) NULL,
  rg_fornecedor VARCHAR(25) NULL,
  orgao_rg_fornecedor VARCHAR(10) NULL,
  cnpj_fornecedor VARCHAR(14) NULL,
  tipo_fornecedor CHAR(1) NULL,
  endereco_fornecedor VARCHAR(100) NULL,
  bairro_fornecedor VARCHAR(50) NULL,
  cidade_fornecedor VARCHAR(50) NULL,
  uf_fornecedor CHAR(2) NULL,
  cep_fornecedor VARCHAR(8) NULL,
  email_fornecedor VARCHAR(100) NULL,
  site_fornecedor VARCHAR(100) NULL,
  fone_fornecedor VARCHAR(10) NULL,
  celular_fornecedor VARCHAR(10) NULL,
  fax_fornecedor VARCHAR(10) NULL,
  contato_fornecedor VARCHAR(50) NULL,
  PRIMARY KEY(cod_fornecedor)
);

-- ------------------------------------------------------------
-- Fechamento
-- ------------------------------------------------------------

CREATE TABLE fechamento (
  cod_fechamento SERIAL NOT NULL,
  mes_ano_fechamento VARCHAR(7) NULL,
  saldo_anterior FLOAT8 NULL,
  vlr_recebimentos FLOAT8 NULL,
  vlr_pagamentos FLOAT8 NULL,
  vlr_cheque_ncomp FLOAT8 NULL,
  vlr_saldo_conta FLOAT8 NULL,
  vlr_saldo_real FLOAT8 NULL,
  PRIMARY KEY(cod_fechamento)
);

-- ------------------------------------------------------------
-- Departamento
-- ------------------------------------------------------------

CREATE TABLE departamento (
  cod_departamento SERIAL NOT NULL,
  nome_departamento VARCHAR(50) NOT NULL,
  PRIMARY KEY(cod_departamento)
);

-- ------------------------------------------------------------
-- Tipo de Pagamento
-- ------------------------------------------------------------

CREATE TABLE tipo_pgto (
  cod_tipo_pgto SERIAL NOT NULL,
  descricao_tipo_pgto VARCHAR(20) NOT NULL,
  PRIMARY KEY(cod_tipo_pgto)
);

CREATE TABLE cfop (
  cod_cfop INTEGER NOT NULL,
  descricao_cfop TEXT NOT NULL,
  PRIMARY KEY(cod_cfop)
);

-- ------------------------------------------------------------
-- Cartao de Credito
-- ------------------------------------------------------------

CREATE TABLE cartao (
  cod_cartao SERIAL NOT NULL,
  nome_cartao VARCHAR(20) NOT NULL,
  taxa_cartao FLOAT8 NOT NULL,
  PRIMARY KEY(cod_cartao)
);

-- ------------------------------------------------------------
-- Banco
-- ------------------------------------------------------------

CREATE TABLE banco (
  cod_banco SERIAL NOT NULL,
  nome_banco VARCHAR(50) NOT NULL,
  agencia_banco INTEGER NOT NULL,
  conta_banco INTEGER NOT NULL,
  gerente_banco VARCHAR(20) NULL,
  fone_banco VARCHAR(10) NULL,
  PRIMARY KEY(cod_banco)
);

-- ------------------------------------------------------------
-- Cheque nao compesado
-- ------------------------------------------------------------

CREATE TABLE cheque_ncomp (
  cod_cheque_ncomp SERIAL NOT NULL,
  num_cheque_ncomp INTEGER NULL,
  data_cheque_ncomp DATE NULL,
  vlr_cheque_ncomp FLOAT8 NULL,
  mes_ano_ncomp VARCHAR(7) NULL,
  historico_ncomp VARCHAR(50) NULL,
  PRIMARY KEY(cod_cheque_ncomp)
);

-- ------------------------------------------------------------
-- Unidade
-- Obs.: Armazena as diversas unidades do produto
-- ------------------------------------------------------------

CREATE TABLE unidade (
  cod_unidade SERIAL NOT NULL,
  descricao_unidade CHAR(5) NOT NULL,
  PRIMARY KEY(cod_unidade)
);

-- ------------------------------------------------------------
-- Cliente
-- ------------------------------------------------------------

CREATE TABLE cliente (
  cod_cliente SERIAL NOT NULL,
  nome_cliente VARCHAR(50) NOT NULL,
  cpf_cliente VARCHAR(11) NULL,
  desde_cliente DATE NULL,
  rg_cliente VARCHAR(25) NULL,
  orgao_rg_cliente VARCHAR(10) NULL,
  nascimento_cliente DATE NULL,
  profissao_cliente VARCHAR(40) NULL,
  empresa_cliente VARCHAR(50) NULL,
  fone_empresa VARCHAR(10) NULL,
  renda_cliente FLOAT8 NULL,
  tipo_cliente CHAR(1) NULL,
  cnpj_cliente VARCHAR(14) NULL,
  referencia_cliente VARCHAR(50) NULL,
  fone_referencia_cliente VARCHAR(10) NULL,
  email VARCHAR(100) NULL,
  PRIMARY KEY(cod_cliente)
);

-- ------------------------------------------------------------
-- Movimento Bancario
-- ------------------------------------------------------------

CREATE TABLE movimento (
  cod_movimento SERIAL NOT NULL,
  cod_plano_conta INTEGER NOT NULL,
  mes_ano_movimento VARCHAR(7) NULL,
  num_cheque_movimento INTEGER NULL,
  num_documento_movimento VARCHAR(20) NULL,
  data_cheque DATE NULL,
  data_lancamento_movimento DATE NULL,
  historico_movimento VARCHAR(50) NULL,
  vlr_documento FLOAT8 NULL,
  PRIMARY KEY(cod_movimento),
  FOREIGN KEY(cod_plano_conta)
    REFERENCES plano_conta(cod_plano_conta)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Telefone do Cliente
-- ------------------------------------------------------------

CREATE TABLE cliente_telefone (
  cod_telefone SERIAL NOT NULL,
  cod_cliente INTEGER NOT NULL,
  numero_telefone VARCHAR(10) NOT NULL,
  tipo_telefone CHAR(1) NOT NULL,
  PRIMARY KEY(cod_telefone),
  FOREIGN KEY(cod_cliente)
    REFERENCES cliente(cod_cliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Carta de Cobranca
-- ------------------------------------------------------------

CREATE TABLE cobranca (
  cod_cobranca SERIAL NOT NULL,
  cod_cliente INTEGER NOT NULL,
  assunto_cobranca VARCHAR(50) NULL,
  texto_cobranca TEXT NULL,
  envio1 DATE NULL,
  envio2 DATE NULL,
  envio3 DATE NULL,
  envio4 DATE NULL,
  envio5 DATE NULL,
  num_processo VARCHAR(30) NULL,
  data_processo DATE NULL,
  advogado_processo VARCHAR(50) NULL,
  PRIMARY KEY(cod_cobranca),
  FOREIGN KEY(cod_cliente)
    REFERENCES cliente(cod_cliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Endereco do Cliente
-- ------------------------------------------------------------

CREATE TABLE cliente_endereco (
  cod_endereco SERIAL NOT NULL,
  cod_cliente INTEGER NOT NULL,
  logradouro_endereco VARCHAR(50) NOT NULL,
  complemento_endereco VARCHAR(50) NULL,
  cep_endereco VARCHAR(8) NULL,
  bairro_endereco VARCHAR(50) NULL,
  cidade_endereco VARCHAR(50) NOT NULL,
  uf_endereco CHAR(2) NOT NULL,
  PRIMARY KEY(cod_endereco),
  FOREIGN KEY(cod_cliente)
    REFERENCES cliente(cod_cliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Funcionario
-- ------------------------------------------------------------

CREATE TABLE funcionario (
  cod_funcionario SERIAL NOT NULL,
  cod_departamento INTEGER NOT NULL,
  nome_funcionario VARCHAR(50) NOT NULL,
  funcao_funcionario VARCHAR(20) NULL,
  login_funcionario VARCHAR(10) NOT NULL,
  senha_funcionario VARCHAR(10) NOT NULL,
  admissao_funcionario DATE NULL,
  acesso_total CHAR(1) NULL,
  PRIMARY KEY(cod_funcionario),
  FOREIGN KEY(cod_departamento)
    REFERENCES departamento(cod_departamento)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Produto
-- ------------------------------------------------------------

CREATE TABLE produto (
  cod_produto VARCHAR(13) NOT NULL,
  cod_fornecedor INTEGER NOT NULL,
  cod_unidade INTEGER NOT NULL,
  descricao_produto VARCHAR(50) NULL,
  vlr_compra_produto FLOAT8 NULL,
  vlr_venda_produto FLOAT8 NULL,
  estoque_produto INTEGER NULL,
  critico_produto INTEGER NULL,
  PRIMARY KEY(cod_produto),
  FOREIGN KEY(cod_unidade)
    REFERENCES unidade(cod_unidade)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_fornecedor)
    REFERENCES fornecedor(cod_fornecedor)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Cabecario de Orcamento
-- ------------------------------------------------------------

CREATE TABLE orc_cab (
  cod_orc_cab SERIAL NOT NULL,
  cod_funcionario INTEGER NOT NULL,
  cod_cliente INTEGER NOT NULL,
  data_orc_cab DATE NULL,
  vlr_orc_cab FLOAT8 NULL,
  PRIMARY KEY(cod_orc_cab),
  FOREIGN KEY(cod_cliente)
    REFERENCES cliente(cod_cliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_funcionario)
    REFERENCES funcionario(cod_funcionario)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Detalhe de Orcamento
-- ------------------------------------------------------------

CREATE TABLE orc_det (
  cod_orc_cab INTEGER NOT NULL,
  cod_produto VARCHAR(13) NOT NULL,
  qtd_orc_det INTEGER NULL,
  vlr_unit_orc_det FLOAT8 NULL,
  vlr_total_orc_det FLOAT8 NULL,
  PRIMARY KEY(cod_orc_cab, cod_produto),
  FOREIGN KEY(cod_orc_cab)
    REFERENCES orc_cab(cod_orc_cab)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_produto)
    REFERENCES produto(cod_produto)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Cabecario da Nota Fical de Entrada
-- Obs.: Todas as Notas Ficais que entrarem na empresas serao armazenas aqui
-- ------------------------------------------------------------

CREATE TABLE nfe_cab (
  numero_nfe_cab INTEGER NOT NULL,
  cod_fornecedor INTEGER NOT NULL,
  cod_cfop INTEGER NOT NULL,
  emissao_nfe_cab DATE NULL,
  entrada_nfe_cab DATE NULL,
  total_nfe_cab FLOAT8 NULL,
  PRIMARY KEY(numero_nfe_cab),
  FOREIGN KEY(cod_cfop)
    REFERENCES cfop(cod_cfop)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_fornecedor)
    REFERENCES fornecedor(cod_fornecedor)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Detalhe da Nota Fical de Entrada
-- ------------------------------------------------------------

CREATE TABLE nfe_det (
  cod_produto VARCHAR(13) NOT NULL,
  numero_nfe_cab INTEGER NOT NULL,
  qtd_nfe_det INTEGER NULL,
  vlr_unit_nfe_det FLOAT8 NULL,
  vlr_total_nfe_det FLOAT8 NULL,
  PRIMARY KEY(cod_produto, numero_nfe_cab),
  FOREIGN KEY(cod_produto)
    REFERENCES produto(cod_produto)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(numero_nfe_cab)
    REFERENCES nfe_cab(numero_nfe_cab)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Cabecario do Pedido
-- ------------------------------------------------------------

CREATE TABLE pedido_cab (
  cod_pedido_cab SERIAL NOT NULL,
  cod_fornecedor INTEGER NOT NULL,
  cod_cot_cab INTEGER NOT NULL,
  data_pedido DATE NULL,
  endereco_entrega VARCHAR(50) NULL,
  endereco_cobranca VARCHAR(50) NULL,
  vlr_pedido_cab FLOAT8 NULL,
  desconto_pedido_cab FLOAT8 NULL,
  total_pedodo_cab FLOAT8 NULL,
  PRIMARY KEY(cod_pedido_cab),
  FOREIGN KEY(cod_cot_cab)
    REFERENCES cot_cab(cod_cot_cab)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_fornecedor)
    REFERENCES fornecedor(cod_fornecedor)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Recebimento
-- ------------------------------------------------------------

CREATE TABLE recebimento (
  cod_recebimento SERIAL NOT NULL,
  cod_cliente INTEGER NOT NULL,
  cod_tipo_pgto INTEGER NOT NULL,
  cod_banco INTEGER NOT NULL,
  num_documento VARCHAR(20) NULL,
  vlr_total_recebimento FLOAT8 NULL,
  vlr_juro_recebimento FLOAT8 NULL,
  vlr_multa_recebimento FLOAT8 NULL,
  vlr_desconto_recebimento FLOAT8 NULL,
  vlr_recebido FLOAT8 NULL,
  emissao_recebimento DATE NULL,
  lancamento_recebimento DATE NULL,
  vencimento_recebimento DATE NULL,
  data_recebimento DATE NULL,
  PRIMARY KEY(cod_recebimento),
  FOREIGN KEY(cod_banco)
    REFERENCES banco(cod_banco)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_tipo_pgto)
    REFERENCES tipo_pgto(cod_tipo_pgto)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_cliente)
    REFERENCES cliente(cod_cliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Pagamento
-- ------------------------------------------------------------

CREATE TABLE pagamento (
  cod_pagamento SERIAL NOT NULL,
  cod_fornecedor INTEGER NOT NULL,
  cod_banco INTEGER NOT NULL,
  cod_tipo_pgto INTEGER NOT NULL,
  cod_plano_conta INTEGER NOT NULL,
  num_doc_pagamento VARCHAR(20) NULL,
  vlr_total_pagamento FLOAT8 NULL,
  vlr_juro_pagamento FLOAT8 NULL,
  vlr_multa_pagamento FLOAT8 NULL,
  vlr_desconto_pagamento FLOAT8 NULL,
  vlr_pago_pagamento FLOAT8 NULL,
  num_cheque_pagamento INTEGER NULL,
  nominal_pagamento VARCHAR(50) NULL,
  emissao_pagamento DATE NULL,
  lancamento_pagamento DATE NULL,
  vencimento_pagamento DATE NULL,
  data_pagamento DATE NULL,
  data_cheque_pagamento DATE NULL,
  PRIMARY KEY(cod_pagamento),
  FOREIGN KEY(cod_plano_conta)
    REFERENCES plano_conta(cod_plano_conta)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_tipo_pgto)
    REFERENCES tipo_pgto(cod_tipo_pgto)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_banco)
    REFERENCES banco(cod_banco)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_fornecedor)
    REFERENCES fornecedor(cod_fornecedor)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Cabecario de Venda
-- ------------------------------------------------------------

CREATE TABLE venda_cab (
  cod_venda_cab SERIAL NOT NULL,
  cod_cfop INTEGER NOT NULL,
  cod_tipo_pgto INTEGER NOT NULL,
  cod_funcionario INTEGER NOT NULL,
  cod_cartao INTEGER NOT NULL,
  cod_cliente INTEGER NOT NULL,
  data_venda_cab DATE NULL,
  vlr_venda_cab FLOAT8 NULL,
  desconto_venda_cab FLOAT8 NULL,
  total_venda_cab FLOAT8 NULL,
  num_parcelas_venda_cab INTEGER NULL,
  pri_venci_venda_cab DATE NULL,
  num_nf_venda_cab INTEGER NULL,
  PRIMARY KEY(cod_venda_cab),
  FOREIGN KEY(cod_cliente)
    REFERENCES cliente(cod_cliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_cartao)
    REFERENCES cartao(cod_cartao)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_funcionario)
    REFERENCES funcionario(cod_funcionario)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_tipo_pgto)
    REFERENCES tipo_pgto(cod_tipo_pgto)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_cfop)
    REFERENCES cfop(cod_cfop)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Cabecario de Requisicao
-- ------------------------------------------------------------

CREATE TABLE req_cab (
  cod_req_cab SERIAL NOT NULL,
  cod_funcionario INTEGER NOT NULL,
  data_req_cab DATE NOT NULL,
  PRIMARY KEY(cod_req_cab),
  FOREIGN KEY(cod_funcionario)
    REFERENCES funcionario(cod_funcionario)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Detalhe de Requisicao
-- ------------------------------------------------------------

CREATE TABLE req_det (
  cod_req_cab INTEGER NOT NULL,
  cod_produto VARCHAR(13) NOT NULL,
  qtde_req_det INTEGER NULL,
  vlr_unit_req_det FLOAT8 NULL,
  vlr_total_req_det FLOAT8 NULL,
  PRIMARY KEY(cod_req_cab, cod_produto),
  FOREIGN KEY(cod_produto)
    REFERENCES produto(cod_produto)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_req_cab)
    REFERENCES req_cab(cod_req_cab)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Detalhe de Venda 
-- ------------------------------------------------------------

CREATE TABLE venda_det (
  cod_produto VARCHAR(13) NOT NULL,
  cod_venda_cab INTEGER NOT NULL,
  qtd_venda_det INTEGER NULL,
  vlr_unit_venda_det FLOAT8 NULL,
  vlr_total_venda_det FLOAT8 NULL,
  PRIMARY KEY(cod_produto, cod_venda_cab),
  FOREIGN KEY(cod_venda_cab)
    REFERENCES venda_cab(cod_venda_cab)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_produto)
    REFERENCES produto(cod_produto)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Detalhe de Cotacao
-- ------------------------------------------------------------

CREATE TABLE cot_det (
  cod_cot_cab INTEGER NOT NULL,
  cod_produto VARCHAR(13) NOT NULL,
  cod_req_cab INTEGER NOT NULL,
  qtd_cot_det INTEGER NULL,
  unit1 FLOAT8 NULL,
  unit2 FLOAT8 NULL,
  unit3 FLOAT8 NULL,
  unit4 FLOAT8 NULL,
  unit5 FLOAT8 NULL,
  total1 FLOAT8 NULL,
  total2 FLOAT8 NULL,
  total3 FLOAT8 NULL,
  total4 FLOAT8 NULL,
  total5 FLOAT8 NULL,
  PRIMARY KEY(cod_cot_cab, cod_produto, cod_req_cab),
  FOREIGN KEY(cod_cot_cab)
    REFERENCES cot_cab(cod_cot_cab)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_req_cab, cod_produto)
    REFERENCES req_det(cod_req_cab, cod_produto)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

-- ------------------------------------------------------------
-- Detalhe de Pedido
-- ------------------------------------------------------------

CREATE TABLE pedido_det (
  cod_req_cab INTEGER NOT NULL,
  cod_produto VARCHAR(13) NOT NULL,
  cod_cot_cab INTEGER NOT NULL,
  cod_pedido_cab INTEGER NOT NULL,
  qtde_pedido_det INTEGER NULL,
  vlr_unit_pedido_det FLOAT8 NULL,
  vlr_total_pedido_det FLOAT8 NULL,
  PRIMARY KEY(cod_req_cab, cod_produto, cod_cot_cab, cod_pedido_cab),
  FOREIGN KEY(cod_pedido_cab)
    REFERENCES pedido_cab(cod_pedido_cab)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(cod_cot_cab, cod_produto, cod_req_cab)
    REFERENCES cot_det(cod_cot_cab, cod_produto, cod_req_cab)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);


