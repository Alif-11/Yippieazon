import { getApiClient } from "./api/client";

const apiURL = import.meta.env.VITE_API_URL || "http://localhost:3002";

export async function getCartItems(userId: string) {
  try {
    const apiClient = getApiClient();
    const response = await apiClient.get(`/api/shopping-cart/items/${userId}`);
    return response.data;
  }

  catch (error) {
    console.log("Error found when trying to retrieve cart items.");
    throw error;
  }
}
