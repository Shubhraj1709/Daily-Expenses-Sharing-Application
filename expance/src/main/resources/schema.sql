CREATE TABLE IF NOT EXISTS `user` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `email` VARCHAR(255) NOT NULL,
    `name` VARCHAR(255) NOT NULL,
    `mobile_number` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `expense` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `description` VARCHAR(255) NOT NULL,
    `amount` DOUBLE NOT NULL,
    `split_method` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `expense_split` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `expense_id` BIGINT NOT NULL,
    `user_id` BIGINT NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`expense_id`) REFERENCES `expense`(`id`),
    FOREIGN KEY (`user_id`) REFERENCES `user`(`id`)
);
