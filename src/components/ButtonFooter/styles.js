import { StyleSheet } from "react-native";
import { theme } from "../../styles/theme";

export const styles = StyleSheet.create({
  button: {
    flex: 1,
    alignItems: 'center',
  },

  textIsPressed: {
    color: theme.colors.blue,
    fontFamily: theme.fonts.semiBold,
    fontSize: 13,
  },

  textNormal: {
    color: theme.colors.gray,
    fontFamily:theme.fonts.semiBold,
    fontSize: 13
  }
});