CREATE TABLE ogarnizer_order
(
    order_id                SERIAL          NOT NULL,
    created_by_user_id      INT             NOT NULL,
    created_date            TIMESTAMP       NOT NULL,
    priority_id             INT             NOT NULL,
    client_id               INT             NOT NULL,
    description             VARCHAR(100),
    device                  VARCHAR(50)     NOT NULL,
    additional_info         VARCHAR(100),
    update_info             VARCHAR(100),
    stage_id                INT             NOT NULL,
    PRIMARY KEY (order_id),
    CONSTRAINT fk_order_created_by_user_id
        FOREIGN KEY (created_by_user_id)
            REFERENCES ogarnizer_user (user_id) ON DELETE CASCADE,
    CONSTRAINT fk_order_priority
        FOREIGN KEY (priority_id)
            REFERENCES ogarnizer_priority (priority_id),
    CONSTRAINT fk_order_client
        FOREIGN KEY (client_id)
            REFERENCES ogarnizer_client (client_id) ON DELETE CASCADE,
    CONSTRAINT fk_order_stage
        FOREIGN KEY (stage_id)
            REFERENCES ogarnizer_stage (stage_id)
);