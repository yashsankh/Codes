import pandas as pd
import numpy as np
import yfinance as yf
from statsmodels.tsa.arima_model import ARIMA
import matplotlib.pyplot as plt

stock_symbol = 'AAPL'
start_date = '2000-01-01'
end_date = '2020-12-31'
stock_data = yf.download(stock_symbol, start=start_date, end=end_date)

plt.figure(figsize=(12, 6))
plt.plot(stock_data['Close'], label='Closing Price')
plt.title('Stock Price Analysis')
plt.legend()
plt.show()

model = ARIMA(stock_data['Close'], order=(5,1,0))  # Example order, requires hyperparameter tuning
model_fit = model.fit(disp=0)

forecast_periods = 30  
forecast, stderr, conf_int = model_fit.forecast(steps=forecast_periods)

plt.figure(figsize=(12, 6))
plt.plot(stock_data['Close'], label='Actual Prices')
plt.plot(range(len(stock_data), len(stock_data) + forecast_periods), forecast, color='red', label='Predicted Prices')
plt.title('Stock Price Prediction')
plt.legend()
plt.show()