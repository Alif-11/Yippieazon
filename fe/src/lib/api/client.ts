import axios from "axios";


export const getApiClient = () => {
  const apiClient = axios.create({
    baseURL: import.meta.env.VITE_API_URL,
    headers: {
      'Content-Type': 'application/json',
    }
  });

  return apiClient;
}