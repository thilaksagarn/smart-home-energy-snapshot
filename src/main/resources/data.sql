-- Insert sample appliances
INSERT INTO appliance (id, name, type) VALUES
(1, 'Refrigerator', 'Kitchen'),
(2, 'Washing Machine', 'Laundry'),
(3, 'Television', 'Living Room'),
(4, 'Air Conditioner', 'Bedroom'),
(5, 'Microwave', 'Kitchen');

-- Insert sample energy usage data
INSERT INTO energy_usage (id, appliance_id, timestamp, energy_consumed) VALUES
(1, 1, '2023-10-01 08:00:00', 2.5),
(2, 2, '2023-10-01 09:00:00', 1.8),
(3, 3, '2023-10-01 10:00:00', 0.5),
(4, 4, '2023-10-01 11:00:00', 3.2),
(5, 5, '2023-10-01 12:00:00', 0.7),
(6, 1, '2023-10-01 13:00:00', 2.7),
(7, 2, '2023-10-01 14:00:00', 1.9),
(8, 3, '2023-10-01 15:00:00', 0.6),
(9, 4, '2023-10-01 16:00:00', 3.5),
(10, 5, '2023-10-01 17:00:00', 0.8);