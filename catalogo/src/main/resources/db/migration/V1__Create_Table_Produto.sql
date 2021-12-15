CREATE TABLE `produto` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`categoria` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`nome_produto` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`preco_unitario` DECIMAL(19,2) NULL DEFAULT NULL,
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;